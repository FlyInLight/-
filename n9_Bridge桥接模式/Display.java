/**
 * 桥接模式 - 抽象化角色（Display）。
 *
 * 这是桥接模式的抽象化角色，它包含了一个实现化角色（DisplayImpl）的引用，并定义了基本的操作方法。
 * Display类的子类可以通过调用实现化角色的具体方法来实现自己的功能。
 */
package n9_Bridge桥接模式;

public class Display {
    private DisplayImpl impl; // 持有一个实现化角色的引用

    public Display(DisplayImpl impl) {
        this.impl = impl; // 构造方法传入实现化角色的对象
    }

    /**
     * 打开显示器。
     * 调用实现化角色的rawOpen方法。
     */
    public void open() {
        impl.rawOpen();
    }

    /**
     * 打印内容。
     * 调用实现化角色的rawPrint方法。
     */
    public void print() {
        impl.rawPrint();
    }

    /**
     * 关闭显示器。
     * 调用实现化角色的rawClose方法。
     */
    public void close() {
        impl.rawClose();
    }

    /**
     * 显示内容。
     * 通过调用open、print和close方法来显示内容，这是一个模版方法，子类不可修改。
     */
    public final void display() {
        open(); // 打开显示器
        print(); // 打印内容
        close(); // 关闭显示器
    }

}
