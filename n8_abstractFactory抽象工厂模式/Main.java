/**
 * 客户端类（Main）。
 * <p>
 * 这是抽象工厂模式的客户端代码，用于演示如何使用抽象工厂模式创建不同的页面产品。
 * 在这个例子中，我们使用`ListFactory`作为具体工厂来创建页面产品，并将生成的页面输出为HTML文件。
 */
package n8_abstractFactory抽象工厂模式;

public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("n8_abstractFactory抽象工厂模式.ListFactory");
//        Factory factory = Factory.getFactory("n8_abstractFactory抽象工厂模式.TableFactory");

        Link people = factory.createLink("人民日报", "http://www.people.com/");
        Link gmw = factory.createLink("光明日报", "");
        Link us_yahoo = factory.createLink("Yahoo!", "");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("检索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", " 小明");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}
