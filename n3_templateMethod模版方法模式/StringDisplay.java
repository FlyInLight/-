/**
 * 具体子类（Concrete Class）。
 *
 * 在模板方法模式中，StringDisplay类是具体子类，它继承了抽象模板类AbstractDisplay，
 * 并实现了其中的抽象方法，来定义自己的具体算法。
 */
package n3_templateMethod模版方法模式;

public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;

    /**
     * 构造函数，用于创建一个StringDisplay对象。
     *
     * @param string 要显示的字符串
     */
    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    /**
     * 实现抽象方法：打开（Open）。
     * 用于打印横线
     */
    @Override
    public void open() {
        printLine();
    }

    /**
     * 实现抽象方法：打印（Print）。
     * 用于打印字符串
     */
    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    /**
     * 实现抽象方法：关闭（Close）。
     * 用于打印横线
     */
    @Override
    public void close() {
        printLine();
    }

    /**
     * 私有方法：打印横线。
     * 用于在打开和关闭时打印横线，横线长度与字符串宽度一致。
     */
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
