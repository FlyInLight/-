/**
 * 具体产品类（Concrete Product） - 列表托盘（ListTray）。
 * <p>
 * 在抽象工厂模式中，ListTray类是具体产品类，它继承自Tray类并实现具体的列表托盘产品功能。
 * 具体的列表托盘产品对象将包含标题和内容属性，并根据这些属性生成对应的HTML格式代码。
 */
package n8_abstractFactory抽象工厂模式;

import java.util.Iterator;

public class ListTray extends Tray {

    /**
     * 构造函数，用于初始化列表托盘的标题。
     *
     * @param caption 托盘的标题
     */
    public ListTray(String caption) {
        super(caption);
    }

    /**
     * 实现了抽象方法makeHTML()，用于生成列表托盘产品的HTML格式代码。
     *
     * @return 列表托盘产品的HTML格式代码
     */
    @Override
    public String makeHTML() {
        // 使用StringBuffer拼接HTML格式代码
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");

        // 遍历托盘中的内容集合，获取内容项并拼接到HTML格式代码中
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append(item.makeHTML());
        }

        buffer.append("</ul>\n");
        buffer.append("</li>\n");

        // 返回生成的HTML格式代码
        return buffer.toString();
    }
}
