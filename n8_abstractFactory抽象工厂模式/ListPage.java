/**
 * 具体产品类（Concrete Product） - 列表页面（ListPage）。
 *
 * 在抽象工厂模式中，ListPage类是具体产品类，它继承自Page类并实现具体的列表页面产品功能。
 * 具体的列表页面产品对象将包含标题、作者和内容属性，并根据这些属性生成对应的HTML格式代码。
 */
package n8_abstractFactory抽象工厂模式;

import java.util.Iterator;

public class ListPage extends Page {

    /**
     * 构造函数，用于初始化列表页面的标题和作者。
     *
     * @param title  页面的标题
     * @param author 页面的作者
     */
    public ListPage(String title, String author) {
        super(title, author);
    }

    /**
     * 实现了抽象方法makeHTML()，用于生成列表页面产品的HTML格式代码。
     *
     * @return 列表页面产品的HTML格式代码
     */
    @Override
    public String makeHTML() {
        // 使用StringBuilder拼接HTML格式代码
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><title>" + title + "</title></head>\n");
        sb.append("<body>\n");
        sb.append("<h1>" + title + "</h1>\n");
        sb.append("<ul>\n");

        // 遍历内容集合，获取内容项并拼接到HTML格式代码中
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            sb.append(item.makeHTML());
        }

        sb.append("</ul>\n");
        sb.append("<hr><address>" + author + "</address>");
        sb.append("</body></html>\n");

        // 返回生成的HTML格式代码
        return sb.toString();
    }
}
