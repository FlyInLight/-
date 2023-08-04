/**
 * 访问者模式 - Visitor抽象类
 *
 * Visitor抽象类定义了对File和Directory进行访问的抽象方法。
 * 具体的访问者类需要继承这个抽象类，并实现其中的抽象方法，以实现对元素的具体访问操作。
 */
package n13_visitor访问者模式;

public abstract class Visitor {
    // 抽象方法，对File进行访问
    public abstract void visit(File file);

    // 抽象方法，对Directory进行访问
    public abstract void visit(Directory directory);
}
