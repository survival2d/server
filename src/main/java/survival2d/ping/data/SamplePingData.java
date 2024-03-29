package survival2d.ping.data;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import survival2d.match.entity.match.Match;

public class SamplePingData {

  public static int playerId = 1999;
  public static Vector2 position = new Vector2(MathUtils.PI, MathUtils.PI);
  public static float rotation = new Vector2(1, 1).angleRad();
  public static Match match;
  public static MoveResponse moveResponse = new MoveResponse(playerId, position, rotation);

  static {
    match = new Match(9999);
    for (int i = 0; i < 100; i++) {
      match.addPlayer(0, i);
    }
  }

  private record MoveResponse(int playerId, Vector2 position, float rotation) {}
}
