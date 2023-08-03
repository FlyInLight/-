/**
 * 装饰器模式 - Display类
 *
 * Display类是一个抽象类，定义了显示文本的基本接口，包括获取列数、行数和指定行文本的方法。
 * 具体的文本显示类将继承自Display类并实现这些抽象方法。
 */
package n12_decorator装饰器模式;

public abstract class Display {
    public abstract int getColumns();    // 获取列数
    public abstract int getRows();       // 获取行数
    public abstract String getRowText(int row); // 获取指定行的文本

    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
