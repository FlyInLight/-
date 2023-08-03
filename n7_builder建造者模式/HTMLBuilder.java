/**
 * 具体建造者类（Concrete Builder）。
 * <p>
 * 在建造者模式中，HTMLBuilder类是具体建造者类，它继承自Builder抽象建造者类，
 * 并实现了构建产品的具体方法，用于生成HTML格式的文档。
 */
package n7_builder建造者模式;

import java.io.PrintWriter;

public class HTMLBuilder extends Builder {
    private String filename;    // 文件名
    private PrintWriter writer;  // 用以写入文件的PrintWriter

    @Override
    public void makeTitle(String title) { // HTML文件的标题
        filename = title + ".html";     // 将标题作为文件名
        try {
            writer = new PrintWriter(filename, "UTF-8");    // 生成PrintWriter对象用于写入文件
        } catch (Exception e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        // 添加标题，用<h1>标签输出
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) { // HTML文件中的字符串
        writer.println("<p>" + str + "</p>");   // 用<p>标签输出
    }

    @Override
    public void makeItems(String[] items) { // HTML文件中的条目
        writer.println("<ul>");     // 用<ul>和<li>进行标记
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() { // 完成文档
        writer.println("</body></html>");   // 关闭标签
        writer.close(); // 关闭文件
    }

    /**
     * 获取生成的HTML文档文件名。
     *
     * @return 生成的HTML文档文件名
     */
    public String getResult() { // 编写完成的文档
        return filename;
    }
}
