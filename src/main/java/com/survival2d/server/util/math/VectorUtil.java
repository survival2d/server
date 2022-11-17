package com.survival2d.server.util.math;


import com.survival2d.server.game.entity.base.Circle;
import com.survival2d.server.game.entity.base.Dot;
import com.survival2d.server.game.entity.base.Rectangle;
import com.survival2d.server.game.entity.base.Shape;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.locationtech.jts.math.Vector2D;

@Slf4j
public class VectorUtil {

  public static final Vector2D ZERO = new Vector2D(0, 0);

  public static boolean isZero(Vector2D vector) {
    return vector.equals(ZERO);
  }
  @Deprecated

  public static boolean isCollision(Vector2D a, Vector2D b, double radius) {
    return a.distance(b) <= radius;
  }

  public static boolean isCollision(Vector2D v1, Shape s1, Vector2D v2, Shape s2) {
    if (s1 instanceof Dot) {
      if (s2 instanceof Dot) {
        return isCollisionBetweenDotAndDot(v1, v2);
      } else if (s2 instanceof Circle) {
        return isCollisionBetweenDotAndCircle(v1, v2, (Circle) s2);
      } else if (s2 instanceof Rectangle) {
        return isCollisionBetweenDotAndRectangle(v1, v2, (Rectangle) s2);
      }

    } else if (s1 instanceof Circle) {
      if (s2 instanceof Dot) {
        return isCollisionBetweenDotAndCircle(v2, v1, (Circle) s1);
      } else if (s2 instanceof Circle) {
        return isCollisionBetweenCircleAndCircle(v1, (Circle) s1, v2, (Circle) s2);
      } else if (s2 instanceof Rectangle) {
        return isCollisionBetweenCircleAndRectangle(v1, (Circle) s1, v2, (Rectangle) s2);
      }
    } else if (s1 instanceof Rectangle) {
      if (s2 instanceof Dot) {
        return isCollisionBetweenDotAndRectangle(v2, v1, (Rectangle) s1);
      } else if (s2 instanceof Circle) {
        return isCollisionBetweenCircleAndRectangle(v2, (Circle) s2, v1, (Rectangle) s1);
      } else if (s2 instanceof Rectangle) {
        return isCollisionBetweenRectangleAndRectangle(v1, (Rectangle) s1, v2, (Rectangle) s2);
      }
    }
    log.error("Not handled collision between {} and {}", s1.getClass(), s2.getClass());
    return false;
  }


  public static boolean isCollisionBetweenDotAndDot(Vector2D v1, Vector2D v2) {
    return isZero(v1.subtract(v2));
  }

  public static boolean isCollisionBetweenDotAndCircle(Vector2D v1, Vector2D v2, Circle c2) {
    return v1.distance(v2) <= c2.getRadius();
  }

  public static boolean isCollisionBetweenDotAndRectangle(Vector2D v1, Vector2D v2, Rectangle r2) {
    return v1.getX() >= v2.getX() && v1.getX() <= v2.getX() + r2.getWidth()
        && v1.getY() >= v2.getY()
        && v1.getY() <= v2.getY() + r2.getHeight();
  }

  public static boolean isCollisionBetweenCircleAndCircle(Vector2D v1, Circle c1, Vector2D v2,
      Circle c2) {
    return v1.distance(v2) <= c1.getRadius() + c2.getRadius();
  }

  public static boolean isCollisionBetweenCircleAndRectangle(Vector2D v1, Circle c1, Vector2D v2,
      Rectangle r2) {
    val dx = Math.abs(v1.getX() - (v2.getX() + r2.getWidth() / 2));
    val dy = Math.abs(v1.getY() - (v2.getY() + r2.getHeight() / 2));
    if (dx > c1.getRadius() + r2.getWidth() / 2) {
      return false;
    }
    if (dy > c1.getRadius() + r2.getHeight() / 2) {
      return false;
    }
    if (dx <= r2.getWidth() / 2) {
      return true;
    }
    if (dy <= r2.getHeight() / 2) {
      return true;
    }
    val dCorner_2 =
        (dx - r2.getWidth() / 2) * (dx - r2.getWidth() / 2) + (dy - r2.getHeight() / 2) * (dy
            - r2.getHeight() / 2);
    return dCorner_2 <= c1.getRadius() * c1.getRadius();
  }

  public static boolean isCollisionBetweenRectangleAndRectangle(Vector2D v1, Rectangle r1,
      Vector2D v2, Rectangle r2) {
    return v1.getX() <= v2.getX() + r2.getWidth()
        && v1.getX() + r1.getWidth() >= v2.getX()
        && v1.getY() <= v2.getY() + r2.getHeight()
        && v1.getY() + r1.getHeight() >= v2.getY();
  }

}