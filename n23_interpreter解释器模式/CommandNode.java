/**
 * 非终结符表达式 - 命令节点
 *
 * CommandNode表示一个具体的命令。它是非终结符表达式的一种，它可以包含其他类型的子节点，
 * 如RepeatCommandNode和PrimitiveCommandNode，来表示不同类型的命令。
 */
package n23_interpreter解释器模式;

public class CommandNode extends Node {
    private Node node;

    @Override
    public void parse(Context context) throws ParseException {
        if (context.currentToken().equals("repeat")) {
            node = new RepeatCommandNode();
            node.parse(context);
        } else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }

    @Override
    public String toString() {
        return node.toString();
    }
}
