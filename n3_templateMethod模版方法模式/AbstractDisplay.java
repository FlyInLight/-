/**
 * 抽象模板类（Abstract Display）。
 *
 * 在模板方法模式中，AbstractDisplay类是抽象模板类，它定义了一个算法框架，将算法的某些步骤延迟到子类实现。
 * AbstractDisplay类中包含了三个抽象方法：open()、print()和close()，这些方法代表了算法中的具体步骤，
 * 它们的具体实现由子类来完成。
 *
 * AbstractDisplay类还定义了一个final（不可被重写）的模板方法display()，该方法包含了算法的骨架，
 * 即算法的整体流程和顺序。display()方法内部会依次调用open()、print()和close()方法，来完成算法的执行。
 *
 * 子类继承AbstractDisplay类后，需要实现open()、print()和close()方法，以及根据具体需求来重写display()方法，
 * 从而定义自己的具体算法。
 */
package n3_templateMethod模版方法模式;

public abstract class AbstractDisplay {
    /**
     * 抽象方法：打开（Open）。
     * 由子类具体实现，用于打开资源或准备显示内容的操作。
     */
    public abstract void open();

    /**
     * 抽象方法：打印（Print）。
     * 由子类具体实现，用于打印显示内容的操作。
     */
    public abstract void print();

    /**
     * 抽象方法：关闭（Close）。
     * 由子类具体实现，用于关闭资源或清理显示内容的操作。
     */
    public abstract void close();

    /**
     * 模板方法（Template Method）：显示（Display）。
     * final修饰，不可被子类重写。
     * 定义了算法的整体流程和顺序，包含了调用open()、print()和close()方法来完成具体算法的执行。
     */
    public final void display() {
        open(); // 打开资源或准备显示内容的操作
        for (int i = 0; i < 5; i++) {
            print(); // 打印显示内容的操作，循环5次
        }
        close(); // 关闭资源或清理显示内容的操作
    }
}
