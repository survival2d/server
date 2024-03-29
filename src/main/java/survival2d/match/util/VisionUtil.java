package survival2d.match.util;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import survival2d.match.config.GameConfig;

public class VisionUtil {
  public static final int TILE_SIZE = 100;
  public static final int HALF_TILE_SIZE = TILE_SIZE / 2;
  public static final int TILE_SIZE_PLUS_1 = TILE_SIZE + 1;
  public static final int TILE_SIZE_PLUS_2 = TILE_SIZE + 2;

  private static int getBase(double v) {
    return (int) Math.floor(v / TILE_SIZE);
  }

  public static int getBaseX(Vector2 v) {
    return getBase(v.x);
  }

  public static int getBaseY(Vector2 v) {
    return getBase(v.y);
  }

  public static boolean isSameVisionX(Vector2 a, Vector2 b) {
    return getBaseX(a) == getBaseX(b);
  }

  public static boolean isSameVisionY(Vector2 a, Vector2 b) {
    return getBaseY(a) == getBaseY(b);
  }

  public static Rectangle getBoundaryXAxis(Vector2 oldPos, Vector2 newPos) {
    if (newPos.x - oldPos.x > 0)
      return new Rectangle(
          getBase(newPos.x + GameConfig.getInstance().getHalfPlayerViewWidth()) * TILE_SIZE - 1,
          getBase(newPos.y - GameConfig.getInstance().getHalfPlayerViewHeight()) * TILE_SIZE - 1,
          TILE_SIZE_PLUS_2,
          GameConfig.getInstance().getPlayerViewHeightPlus2());
    else
      return new Rectangle(
          getBase(newPos.x - GameConfig.getInstance().getHalfPlayerViewWidth()) * TILE_SIZE - 1,
          getBase(newPos.y - GameConfig.getInstance().getHalfPlayerViewHeight()) * TILE_SIZE - 1,
          TILE_SIZE_PLUS_2,
          GameConfig.getInstance().getPlayerViewHeightPlus2());
  }

  public static Rectangle getBoundaryYAxis(Vector2 oldPos, Vector2 newPos) {
    if (newPos.y - oldPos.y > 0)
      return new Rectangle(
          getBase(newPos.x - GameConfig.getInstance().getHalfPlayerViewWidth()) * TILE_SIZE - 1,
          getBase(newPos.y + GameConfig.getInstance().getHalfPlayerViewHeight()) * TILE_SIZE - 1,
          GameConfig.getInstance().getPlayerViewWidthPlus2(),
          TILE_SIZE_PLUS_2);
    else
      return new Rectangle(
          getBase(newPos.x - GameConfig.getInstance().getHalfPlayerViewWidth()) * TILE_SIZE - 1,
          getBase(newPos.y - GameConfig.getInstance().getHalfPlayerViewHeight()) * TILE_SIZE - 1,
          GameConfig.getInstance().getPlayerViewWidthPlus2(),
          TILE_SIZE_PLUS_2);
  }
}
