/**
 * 访问者模式 - File类
 *
 * File类是具体的元素类之一，代表文件。它继承了Entry抽象类，并实现了抽象方法。
 * 在accept方法中，调用Visitor的visit方法，将自身作为参数传递给Visitor，从而实现了元素对访问者的接受操作。
 */
package n13_visitor访问者模式;

public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    // 接受访问者，调用Visitor的visit方法，将自身作为参数传递给Visitor，实现元素对访问者的接受操作。
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
