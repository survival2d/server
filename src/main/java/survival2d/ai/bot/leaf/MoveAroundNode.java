package survival2d.ai.bot.leaf;

import survival2d.ai.bot.BotBehaviorNode;

public class MoveAroundNode extends BotBehaviorNode {
  @Override
  public void processNode() {
    this.controller.commandMoveRandom();
    success();
  }
}
