/**
 * 抽象节点类
 *
 * Node类是解释器模式中的抽象节点类，用于定义解释器的解析方法。
 * 在该抽象类中，声明了一个抽象的解析方法 parse，具体的解释器节点类将继承并实现这个方法来进行文法解析。
 */
package n23_interpreter解释器模式;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
