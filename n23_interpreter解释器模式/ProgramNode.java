/**
 * 程序节点类
 *
 * ProgramNode类是解释器模式中的非终结符表达式类，用于表示程序。
 * 它继承自Node类并实现了解析方法parse，其中会解析program关键字，并创建CommandListNode来解析命令列表。
 * 在toString方法中，会返回表示程序的字符串。
 */
package n23_interpreter解释器模式;

public class ProgramNode extends Node {
    private Node commandListNode;

    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    public String toString() {
        return "[program " + commandListNode + "]";
    }
}
