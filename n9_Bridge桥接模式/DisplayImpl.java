/**
 * 桥接模式 - 实现化角色（DisplayImpl）。
 *
 * 这是桥接模式的实现化角色，它声明了一组用于具体实现化角色的方法，但没有具体的实现。
 * 具体的实现化角色需要继承并重写这些方法来实现自己的功能。
 */
package n9_Bridge桥接模式;

public abstract class DisplayImpl {
    /**
     * 打开显示器。
     * 具体实现由具体的实现化角色提供。
     */
    public abstract void rawOpen();

    /**
     * 打印内容。
     * 具体实现由具体的实现化角色提供。
     */
    public abstract void rawPrint();

    /**
     * 关闭显示器。
     * 具体实现由具体的实现化角色提供。
     */
    public abstract void rawClose();
}
