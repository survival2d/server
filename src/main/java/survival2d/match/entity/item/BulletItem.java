package survival2d.match.entity.item;

import lombok.Getter;
import survival2d.match.entity.base.Item;
import survival2d.match.entity.config.BulletType;
import survival2d.match.entity.config.ItemType;

@Getter
public class BulletItem implements Item {

  final ItemType itemType = ItemType.BULLET;
  BulletType bulletType;
  long numBullet;

  public BulletItem(BulletType bulletType, long numBullet) {
    this.bulletType = bulletType;
    this.numBullet = numBullet;
  }
}
