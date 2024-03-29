package survival2d.match.util;

import com.badlogic.gdx.math.Vector2;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.TreeMap;
import lombok.Getter;

@Getter
public enum TileObject {
  EMPTY(1, 1, 0),
  PLAYER(1, 1, 0),
  ITEM(1, 1, 1),
  WALL(1, 1, 1),
  TREE(1, 1, 1),
  BOX(2, 2, 1),
  ROCK(2, 2, 1);

  final int width;
  final int height;
  final int weight;
  final Vector2 centerOffset;

  TileObject(int width, int height, int weight) {
    this.width = width;
    this.height = height;
    this.weight = weight;
    centerOffset =
        new Vector2(width * MapGenerator.TILE_SIZE / 2, height * MapGenerator.TILE_SIZE / 2);
  }

  public static List<TileObject> getListObstacles() {
    return Lists.newArrayList(ITEM, TREE, BOX, ROCK);
  }

  public static TreeMap<Integer, TileObject> buildObstacleWeight() {
    var map = new TreeMap<Integer, TileObject>();
    var weight = 0;
    for (var obstacle : TileObject.values()) {
      weight += obstacle.weight;
      map.put(weight, obstacle);
    }
    return map;
  }
}
