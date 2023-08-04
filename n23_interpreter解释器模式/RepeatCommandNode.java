/**
 * 重复命令节点类
 *
 * RepeatCommandNode类是解释器模式中的非终结符表达式类，用于表示重复命令。
 * 它继承自Node类并实现了解析方法parse，其中会解析repeat关键字，并获取重复次数，并创建CommandListNode来解析重复的命令列表。
 * 在toString方法中，会返回表示重复命令的字符串。
 */
package n23_interpreter解释器模式;

public class RepeatCommandNode extends Node {
    private int number;
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[repeat " + number + " " + commandListNode + "]";
    }
}
