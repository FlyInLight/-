/**
 * 具体产品类（TablePage）。
 * <p>
 * 这是抽象工厂模式的具体产品类之一，用于创建表格样式的页面（TablePage）。
 */
package n8_abstractFactory抽象工厂模式;

import java.util.Iterator;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author); // 调用父类Page的构造方法，初始化页面的标题和作者
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>\n"); // 添加HTML头部信息和标题
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n"); // 添加页面标题
        buffer.append("<table width=\"80%\" border=\"3\">\n"); // 创建一个表格，并设置表格宽度和边框大小
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next(); // 遍历页面内容，获取每个条目的HTML代码
            buffer.append("<tr>" + item.makeHTML() + "</tr>"); // 将每个条目的HTML代码添加为表格的一行
        }
        buffer.append("</table>\n"); // 关闭表格
        buffer.append("<hr><address>" + author + "</address>"); // 添加页面底部的作者信息
        buffer.append("</body></html>\n"); // 关闭HTML标签
        return buffer.toString(); // 返回整个页面的HTML代码
    }
}
