/**
 * 具体产品类（TableTray）。
 * <p>
 * 这是抽象工厂模式的具体产品类之一，用于创建表格样式的托盘（TableTray）。
 */
package n8_abstractFactory抽象工厂模式;

import java.util.Iterator;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption); // 调用父类Tray的构造方法，初始化托盘的标题
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>\n"); // 创建一个表格单元格
        buffer.append("<table width=\"100%\" border=\"1\">\n"); // 创建一个表格，并设置表格宽度和边框大小
        buffer.append("<tr>\n"); // 创建表格的第一行
        buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + tray.size() + "\"><b>" + caption + "</b></td>\n"); // 在表格的第一行添加一个带标题的表头
        buffer.append("</tr>\n"); // 关闭第一行
        buffer.append("<tr>\n"); // 创建表格的第二行
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next(); // 遍历托盘中的条目，获取每个条目的HTML代码
            buffer.append(item.makeHTML()); // 将每个条目的HTML代码添加为表格的一行
        }
        buffer.append("</tr>\n"); // 关闭第二行
        buffer.append("</table>\n"); // 关闭表格
        buffer.append("</td>\n"); // 关闭表格单元格
        return buffer.toString(); // 返回整个托盘的HTML代码
    }
}
