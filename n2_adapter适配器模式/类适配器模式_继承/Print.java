/**
 * 目标接口（Target）。
 *
 * 在适配器模式中，Print接口是目标接口，它定义了客户端所期望的接口，即适配器需要将被适配的类（Adaptee）
 * 的接口转换成目标接口。
 *
 * 在本例中，Print接口声明了两个抽象方法：printWeak()和printStrong()，分别用于实现弱化显示和强化显示。
 * 客户端将通过这两个方法来实现对被适配的类（Adaptee）的不同打印方式的调用。
 */
package n2_adapter适配器模式.类适配器模式_继承;

public interface Print {
    /**
     * 打印弱化显示的内容。
     */
    public abstract void printWeak();

    /**
     * 打印强化显示的内容。
     */
    public abstract void printStrong();
}
