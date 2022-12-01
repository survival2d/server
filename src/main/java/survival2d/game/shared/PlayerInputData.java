package survival2d.game.shared;

import lombok.Data;

@Data
public class PlayerInputData {

  boolean[] inputs;
  int time;

  public PlayerInputData(boolean[] inputs, int time) {
    this.inputs = inputs;
    this.time = time;
  }
}