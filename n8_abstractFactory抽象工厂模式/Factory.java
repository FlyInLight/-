/**
 * 抽象工厂类（Abstract Factory）。
 *
 * 在抽象工厂模式中，Factory类是抽象工厂类，它定义了静态工厂方法和抽象工厂方法，
 * 用于创建具体产品的实例。具体工厂类将继承自Factory类并实现这些抽象方法，从而创建
 * 具体产品的对象。
 */
package n8_abstractFactory抽象工厂模式;

public abstract class Factory {

    /**
     * 静态工厂方法，用于获取具体工厂的实例。
     *
     * @param classname 具体工厂类的类名
     * @return 具体工厂类的实例
     */
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            // 使用反射机制创建具体工厂类的实例
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("没有找到" + classname);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    /**
     * 抽象工厂方法，用于创建链接（Link）产品的实例。
     *
     * @param caption 链接的标题
     * @param url 链接的URL地址
     * @return 创建的链接（Link）产品的实例
     */
    public abstract Link createLink(String caption, String url);

    /**
     * 抽象工厂方法，用于创建托盘（Tray）产品的实例。
     *
     * @param caption 托盘的标题
     * @return 创建的托盘（Tray）产品的实例
     */
    public abstract Tray createTray(String caption);

    /**
     * 抽象工厂方法，用于创建页面（Page）产品的实例。
     *
     * @param title 页面的标题
     * @param author 页面的作者
     * @return 创建的页面（Page）产品的实例
     */
    public abstract Page createPage(String title, String author);
}
