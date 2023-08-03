/**
 * 具体工厂类（Concrete Factory） - 列表工厂（ListFactory）。
 * <p>
 * 在抽象工厂模式中，ListFactory类是具体工厂类，它继承自抽象工厂类Factory并实现了具体的工厂方法。
 * 具体工厂类负责创建具体的产品对象，即列表链接（ListLink）、列表托盘（ListTray）和列表页面（ListPage）。
 */
package n8_abstractFactory抽象工厂模式;

public class ListFactory extends Factory {

    /**
     * 实现了抽象工厂类中的创建链接产品方法，用于创建具体的列表链接产品对象。
     *
     * @param caption 链接的标题
     * @param url     链接的URL地址
     * @return 列表链接产品对象
     */
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    /**
     * 实现了抽象工厂类中的创建托盘产品方法，用于创建具体的列表托盘产品对象。
     *
     * @param caption 托盘的标题
     * @return 列表托盘产品对象
     */
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    /**
     * 实现了抽象工厂类中的创建页面产品方法，用于创建具体的列表页面产品对象。
     *
     * @param title  页面的标题
     * @param author 页面的作者
     * @return 列表页面产品对象
     */
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
