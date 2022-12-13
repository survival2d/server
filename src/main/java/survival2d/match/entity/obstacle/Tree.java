package survival2d.match.entity.obstacle;

import lombok.Data;
import org.locationtech.jts.math.Vector2D;
import survival2d.match.entity.base.Circle;
import survival2d.match.entity.base.Destroyable;
import survival2d.match.entity.base.HasHp;
import survival2d.util.serialize.ExcludeFromGson;

@Data
public class Tree implements Destroyable, HasHp, Obstacle {

  @ExcludeFromGson int id;
  @ExcludeFromGson double hp = 100;
  Vector2D position;
  @ExcludeFromGson Circle shape;
  ObstacleType type = ObstacleType.TREE;

  @Override
  public boolean isDestroyed() {
    return HasHp.super.isDestroyed();
  }

  @Override
  public void setDestroyed(boolean destroyed) {}
}