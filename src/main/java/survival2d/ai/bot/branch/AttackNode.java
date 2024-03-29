package survival2d.ai.bot.branch;

import java.util.ArrayList;
import survival2d.ai.bot.Bot;
import survival2d.ai.bot.BotBehaviorNode;
import survival2d.ai.bot.leaf.FireNode;
import survival2d.ai.bot.leaf.MoveWhileAttackingNode;
import survival2d.ai.btree.BTNode;
import survival2d.ai.btree.branch.BTSequenceNode;
import survival2d.ai.btree.decorator.BTAlwaysSuccessNode;

public class AttackNode extends BTSequenceNode {
  AttackNode(Bot controller) {
    super();

    BotBehaviorNode moveWhileAttacking = new MoveWhileAttackingNode();
    moveWhileAttacking.setController(controller);
    BTNode alwaysSuccess = new BTAlwaysSuccessNode(moveWhileAttacking);
    BotBehaviorNode fire = new FireNode();
    fire.setController(controller);

    ArrayList<BTNode> children = new ArrayList<>();
    children.add(alwaysSuccess);
    children.add(fire);

    this.setChildren(children);
  }
}
