/**
 * 访问者模式 - Entry抽象类
 *
 * Entry类是访问者模式中的元素抽象类，实现了Element接口，提供了元素类的通用接口方法的默认实现。
 * 具体的元素类（比如Directory、File等）需要继承该类，并根据需要覆盖父类的方法。
 */
package n13_visitor访问者模式;

import java.util.Iterator;

public abstract class Entry implements Element {
    // 获取元素的名称
    public abstract String getName();

    // 获取元素的大小
    public abstract int getSize();

    // 添加元素，子类可以覆盖该方法以支持添加操作
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    // 获取迭代器，子类可以覆盖该方法以支持迭代遍历操作
    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    // 返回元素的字符串表示，方便打印输出
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
