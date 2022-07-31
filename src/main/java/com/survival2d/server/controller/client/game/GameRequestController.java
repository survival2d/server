package com.survival2d.server.controller.client.game;

import com.survival2d.server.constant.Commands;
import com.survival2d.server.game.shared.PlayerHitData;
import com.survival2d.server.game.shared.PlayerInputData;
import com.survival2d.server.game.shared.PlayerSpawnData;
import com.survival2d.server.request.PlayerHitDataRequest;
import com.survival2d.server.request.PlayerInputDataRequest;
import com.survival2d.server.service.GamePlayService;
import com.survival2d.server.service.RoomService;
import com.tvd12.ezyfox.bean.annotation.EzyAutoBind;
import com.tvd12.ezyfox.core.annotation.EzyDoHandle;
import com.tvd12.ezyfox.core.annotation.EzyRequestController;
import com.tvd12.ezyfox.util.EzyLoggable;
import com.tvd12.ezyfoxserver.entity.EzyUser;
import com.tvd12.ezyfoxserver.support.factory.EzyResponseFactory;
import com.tvd12.gamebox.constant.RoomStatus;
import com.tvd12.gamebox.entity.MMOPlayer;
import com.tvd12.gamebox.entity.MMORoom;
import com.tvd12.gamebox.entity.Player;
import java.util.ArrayList;
import java.util.List;
import lombok.Setter;

@Setter
@EzyRequestController
public class GameRequestController extends EzyLoggable {

  @EzyAutoBind private RoomService roomService;

  @EzyAutoBind private GamePlayService gamePlayService;

  @EzyAutoBind private EzyResponseFactory responseFactory;

  @EzyDoHandle(Commands.GET_MMO_ROOM_PLAYERS)
  public void getMMORoomPlayers(EzyUser user) {
    logger.info("user {} getMMORoomPlayers", user);
    MMORoom currentRoom = (MMORoom) roomService.getCurrentRoom(user.getName());
    List<String> players = roomService.getRoomPlayerNames(currentRoom);
    Player master = roomService.getMaster(currentRoom);

    responseFactory
        .newObjectResponse()
        .command(Commands.GET_MMO_ROOM_PLAYERS)
        .param("players", players)
        .param("master", master.getName())
        .user(user)
        .execute();
  }

  @EzyDoHandle(Commands.START_GAME)
  public void startGame(EzyUser user) {
    logger.info("user {} start game", user);
    MMORoom currentRoom = (MMORoom) roomService.getCurrentRoom(user.getName());
    currentRoom.setStatus(RoomStatus.PLAYING);
    List<String> playerNames = roomService.getRoomPlayerNames(currentRoom);
    gamePlayService.resetPlayersPositionHistory(playerNames);

    List<PlayerSpawnData> data = gamePlayService.spawnPlayers(playerNames);

    responseFactory
        .newArrayResponse()
        .command(Commands.START_GAME)
        .data(data)
        .usernames(playerNames)
        .execute();
  }

  @EzyDoHandle(Commands.PLAYER_INPUT_DATA)
  public void handlePlayerInputData(EzyUser user, PlayerInputDataRequest request) {
    logger.info("user {} send input data {}", user.getName(), request);
    gamePlayService.handlePlayerInputData(
        user.getName(), new PlayerInputData(request.getK(), request.getT()), request.getR());
  }

  @EzyDoHandle(Commands.PLAYER_HIT)
  public void handlePlayerHit(EzyUser user, PlayerHitDataRequest request) {
    logger.info("user {} send hit command {}", user.getName(), request);
    PlayerHitData playerHitData =
        new PlayerHitData(request.getP(), request.getM(), request.getO(), request.getV());

    boolean isValidHit = gamePlayService.authorizeHit(user.getName(), playerHitData);

    MMORoom currentRoom = (MMORoom) roomService.getCurrentRoom(user.getName());
    List<String> playerNames = roomService.getRoomPlayerNames(currentRoom);

    if (isValidHit) {
      responseFactory
          .newObjectResponse()
          .command(Commands.PLAYER_BEING_ATTACKED)
          .param("a", user.getName())
          .param("t", playerHitData.getMyClientTick())
          .param("p", playerHitData.getAttackPosition())
          .param("b", playerHitData.getVictimName())
          .usernames(playerNames)
          .execute();

      roomService.removePlayerFromGameRoom(playerHitData.getVictimName(), currentRoom);
    } else {
      logger.warn("Player {} send invalid hit ", user.getName());
    }
  }

  @EzyDoHandle(Commands.PLAYER_ATTACK_DATA)
  public void handlePlayerAttackData(EzyUser user) {
    logger.info("user {} send attack command", user.getName());

    MMOPlayer player = roomService.getPlayer(user.getName());
    List<String> nearbyPlayerNames = new ArrayList<>();
    player.getNearbyPlayerNames(nearbyPlayerNames);

    responseFactory
        .newObjectResponse()
        .command(Commands.PLAYER_ATTACK_DATA)
        .param("a", user.getName())
        .usernames(nearbyPlayerNames)
        .execute();
  }
}