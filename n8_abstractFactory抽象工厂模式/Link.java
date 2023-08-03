/**
 * 具体产品类（Concrete Product） - 链接（Link）。
 *
 * 在抽象工厂模式中，Link类是具体产品类，它继承自Item类并实现具体的链接产品功能。
 * 具体的链接产品对象将包含标题和URL属性，并根据这些属性生成对应的HTML格式代码。
 */
package n8_abstractFactory抽象工厂模式;

public abstract class Link extends Item {
    protected String url; // 链接的URL地址

    /**
     * 构造函数，用于初始化链接的标题和URL地址。
     *
     * @param caption 链接的标题
     * @param url     链接的URL地址
     */
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
