/**
 * 桥接模式 - 扩展抽象化角色（CountDisplay）。
 *
 * 这是桥接模式的扩展抽象化角色，继承了抽象化角色（Display）并拥有了额外的功能。
 * CountDisplay是一个特殊的显示器，它可以在显示内容的基础上重复多次显示。
 */
package n9_Bridge桥接模式;

public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl); // 调用父类构造方法，传入具体实现化角色的对象
    }

    /**
     * 多次显示内容。
     *
     * @param times 显示次数
     */
    public void multiDisplay(int times) {
        open(); // 打开显示器
        for (int i = 0; i < times; i++) {
            print(); // 多次打印内容
        }
        close(); // 关闭显示器
    }
}
