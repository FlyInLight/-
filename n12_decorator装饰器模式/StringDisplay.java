/**
 * 装饰器模式 - StringDisplay类
 *
 * StringDisplay类是具体的组件类，它继承自Display类，用于显示单行文本。
 */
package n12_decorator装饰器模式;

public class StringDisplay extends Display {
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    // 获取文本的列数，即文本的字节数
    public int getColumns() {
        return string.getBytes().length;
    }

    // 获取文本的行数，即只有1行
    public int getRows() {
        return 1;
    }

    // 获取指定行的文本，如果是第0行，则返回文本内容，否则返回null
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
