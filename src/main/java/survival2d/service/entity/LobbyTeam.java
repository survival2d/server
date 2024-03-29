package survival2d.service.entity;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Getter;
import survival2d.match.config.GameConfig;

@Getter
public class LobbyTeam {

  private final int id;
  private final Set<Integer> memberIds =
      ConcurrentHashMap.newKeySet(GameConfig.getInstance().getMaxPlayerInTeam());

  public LobbyTeam(int teamId) {
    id = teamId;
  }

  public void addMember(int userId) {
    memberIds.add(userId);
  }

  public boolean removeMember(int userId) {
    return memberIds.remove(userId);
  }

  public Collection<Integer> getMemberIds() {
    return new HashSet<>(memberIds);
  }
}
