package survival2d.service;

import survival2d.game.entity.Match;
import java.util.List;
import java.util.Optional;

public interface MatchingService {

  long createMatch(List<Long> teamIds);

  Optional<Long> getMatchIdOfPlayer(String playerId);

  Optional<Match> getMatchById(long matchId);

  Optional<Match> getMatchOfPlayer(String playerId);

  void destroyMatch(long id);
}