/**
 * 具体产品类（Concrete Product） - 列表链接（ListLink）。
 * <p>
 * 在抽象工厂模式中，ListLink类是具体产品类，它继承自Link类并实现具体的列表链接产品功能。
 * 具体的列表链接产品对象将包含标题和URL属性，并根据这些属性生成对应的HTML格式代码。
 */
package n8_abstractFactory抽象工厂模式;

public class ListLink extends Link {

    /**
     * 构造函数，用于初始化列表链接的标题和URL地址。
     *
     * @param caption 列表链接的标题
     * @param url     列表链接的URL地址
     */
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    /**
     * 实现了抽象方法makeHTML()，用于生成列表链接产品的HTML格式代码。
     *
     * @return 列表链接产品的HTML格式代码
     */
    @Override
    public String makeHTML() {
        // 生成列表链接的HTML格式代码，包含链接的标题和URL地址
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
