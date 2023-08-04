/**
 * 非终结符表达式 - 命令列表节点
 *
 * CommandListNode表示一系列命令的列表。
 * 它是非终结符表达式的一种，它包含了多个CommandNode子节点，每个子节点表示一个具体的命令。
 */
package n23_interpreter解释器模式;

import java.util.ArrayList;

public class CommandListNode extends Node {
    private ArrayList<Node> list = new ArrayList<>();

    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
