/**
 * 抽象产品类（Abstract Product） - 页面（Page）。
 *
 * 在抽象工厂模式中，Page类是抽象产品类，它定义了页面产品的基本属性和行为。
 * 页面产品将包含标题、作者和内容属性，并提供一个抽象方法用于生成对应的HTML格式代码。
 * 此外，页面产品还包含添加内容项和输出HTML文件的方法。
 */
package n8_abstractFactory抽象工厂模式;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public abstract class Page {
    protected String title;        // 页面标题
    protected String author;       // 页面作者
    protected ArrayList content = new ArrayList(); // 页面内容集合，用于存储内容项

    /**
     * 构造函数，用于初始化页面的标题和作者。
     *
     * @param title  页面的标题
     * @param author 页面的作者
     */
    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * 添加内容项到页面中。
     *
     * @param item 要添加的内容项
     */
    public void add(Item item) {
        content.add(item);
    }

    /**
     * 输出HTML文件，将生成的HTML格式代码写入到文件中。
     */
    public void output() {
        try {
            String filename = title + ".html";   // 文件名为标题加上".html"后缀
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());   // 将页面生成的HTML格式代码写入文件
            writer.close();
            System.out.println(filename + " 文件缓存完成。");  // 输出提示信息
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 抽象方法，用于生成页面产品的HTML格式代码。
     * 具体的页面产品将根据标题、作者和内容属性生成对应的HTML格式代码，并返回。
     *
     * @return 页面产品的HTML格式代码
     */
    public abstract String makeHTML();
}
