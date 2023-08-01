/**
 * 具体子类（Concrete Class）。
 *
 * 在模板方法模式中，CharDisplay类是具体子类，它继承了抽象模板类AbstractDisplay，
 * 并实现了其中的抽象方法，来定义自己的具体算法。
 */
package n3_templateMethod模版方法模式;

public class CharDisplay extends AbstractDisplay {
    private char ch;

    /**
     * 构造函数，用于创建一个CharDisplay对象。
     *
     * @param ch 要显示的字符
     */
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    /**
     * 实现抽象方法：打开（Open）。
     * 用于打印"<<"
     */
    @Override
    public void open() {
        System.out.print("<<");
    }

    /**
     * 实现抽象方法：打印（Print）。
     * 用于打印指定字符
     */
    @Override
    public void print() {
        System.out.print(ch);
    }

    /**
     * 实现抽象方法：关闭（Close）。
     * 用于打印">>"
     */
    @Override
    public void close() {
        System.out.println(">>");
    }
}
