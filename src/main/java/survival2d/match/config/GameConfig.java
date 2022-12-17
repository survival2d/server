package survival2d.match.config;

import java.util.List;
import lombok.Getter;
import survival2d.match.constant.GameConstant;
import survival2d.util.config.ConfigReader;
import survival2d.util.serialize.GsonHolder;
import survival2d.util.serialize.PostProcessable;

@Getter
public class GameConfig implements PostProcessable {

  private static final String CONFIG_FILE = "config.json";
  private double mapWidth;
  private double mapHeight;
  private List<Double> safeZonesRadius;
  private int minutePerSafeZone;
  private double defaultSafeZoneCenterX;
  private double defaultSafeZoneCenterY;
  private double defaultSafeZoneRadius;
  private int ticksPerSafeZone;
  private double defaultPlayerHp;
  private double defaultPlayerSpeed;
  private double bandageHeal;
  private double medKitHeal;
  private double playerViewWidth;
  private double playerViewHeight;

  public static void load() {
    InstanceHolder.instance =
        ConfigReader.fromFile(CONFIG_FILE, GameConfig.class, GsonHolder.getEnablePostProcess());
  }

  public static GameConfig getInstance() {
    return InstanceHolder.instance;
  }

  @Override
  public void postProcess() {
    defaultSafeZoneCenterX = mapWidth / 2;
    defaultSafeZoneCenterY = mapHeight / 2;
    defaultSafeZoneRadius = mapWidth;
    ticksPerSafeZone = minutePerSafeZone * 60 * GameConstant.TICK_PER_SECOND;
    medKitHeal = defaultPlayerHp;
  }

  private static class InstanceHolder {

    private static GameConfig instance;

    static {
      load();
    }
  }
}
