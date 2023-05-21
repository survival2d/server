package survival2d.ai.bot.leaf;

import survival2d.ai.bot.BotBehaviorNode;

public class PickUpItemNode extends BotBehaviorNode {
  @Override
  public void processNode() {
    this.controller.commandTakeItem();
    if (this.controller.isMoving()) {
      running();
      this.controller.setRunningNode(this);
    } else {
      success();
      this.controller.setRunningNode(null);
    }
  }
}
