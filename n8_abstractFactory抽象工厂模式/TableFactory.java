/**
 * 具体工厂类（TableFactory）。
 *
 * 这是抽象工厂模式的具体工厂类，用于创建具体的产品对象。
 * 在这个例子中，TableFactory负责创建表格样式的链接（TableLink）、托盘（TableTray）和页面（TablePage）产品。
 */
package n8_abstractFactory抽象工厂模式;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url); // 创建表格样式的链接产品
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption); // 创建表格样式的托盘产品
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author); // 创建表格样式的页面产品
    }
}
