/**
 * 装饰器模式 - SideBorder类
 *
 * SideBorder类是一个具体的装饰器类，它继承自Border类，并对文本进行左右两侧边框的装饰。
 */
package n12_decorator装饰器模式;

public class SideBorder extends Border {
    private char borderChar;

    public SideBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }

    // 获取装饰后文本的列数，比原来多2列（左边的竖线和右边的竖线）
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    // 获取装饰后文本的行数，和原来的行数一样
    public int getRows() {
        return display.getRows();
    }

    // 获取指定行的装饰后文本
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
