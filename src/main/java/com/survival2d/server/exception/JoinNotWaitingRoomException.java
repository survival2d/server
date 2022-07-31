package com.survival2d.server.exception;

import com.tvd12.gamebox.constant.RoomStatus;
import com.tvd12.gamebox.entity.Room;

public class JoinNotWaitingRoomException extends RuntimeException {

  public JoinNotWaitingRoomException(String playerName, Room room) {
    super(
        "player: "
            + playerName
            + " join room with status "
            + room.getStatus()
            + " instead of "
            + RoomStatus.WAITING);
  }
}