/**
 * 具体产品类（TableLink）。
 *
 * 这是抽象工厂模式的具体产品类之一，用于创建表格样式的链接（TableLink）。
 */
package n8_abstractFactory抽象工厂模式;

public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url); // 调用父类Link的构造方法，初始化链接的标题和URL
    }

    @Override
    public String makeHTML() {
        return " <td><a href=\"" + url + "\">" + caption + "</a></td>\n"; // 返回表格样式的HTML代码
    }
}
