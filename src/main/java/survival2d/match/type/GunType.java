package survival2d.match.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum GunType {
  NORMAL(BulletType.NORMAL, 20);
  private final BulletType bulletType;
  private final int bulletCapacity;
}