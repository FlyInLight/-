/**
 * 基础命令节点类
 *
 * PrimitiveCommandNode类是解释器模式中的具体节点类，用于表示基础命令。
 * 它继承自Node类并实现了解析方法parse，在解析时判断当前的命令是go、right还是left，并进行相应的处理。
 * 如果当前的命令不是这三种之一，则抛出ParseException异常。
 */
package n23_interpreter解释器模式;

public class PrimitiveCommandNode extends Node {
    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new ParseException(name + " is undefined");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
