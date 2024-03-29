package survival2d.match.entity.base;

public interface HasHp {

  double getHp();

  void setHp(double hp);

  default void reduceHp(double hp) {
    setHp(getHp() - hp);
  }

  default boolean isAlive() {
    return getHp() > 0;
  }

  default boolean isDestroyed() {
    return !isAlive();
  }
}
