/**
 * 装饰器模式 - FullBorder类
 *
 * FullBorder类是一个具体的装饰器类，它继承自Border类，并对文本进行完整边框的装饰。
 */
package n12_decorator装饰器模式;

public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }

    // 获取装饰后文本的列数，比原来多2列（左边的竖线和右边的竖线）
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    // 获取装饰后文本的行数，比原来多2行（上边的横线和下边的横线）
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    // 获取指定行的装饰后文本
    public String getRowText(int row) {
        if (row == 0) { // 第一行
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) { // 最后一行
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else { // 中间行
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    // 辅助方法，用于生成指定数量的字符组成的字符串
    private String makeLine(char ch, int count) {
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
