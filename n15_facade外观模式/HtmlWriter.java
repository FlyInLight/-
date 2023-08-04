/**
 * 外观模式 - HtmlWriter类
 * <p>
 * HtmlWriter类是一个简单的HTML文档生成器，封装了一些HTML标签的生成方法，简化了HTML文档的创建过程。
 */
package n15_facade外观模式;

import java.io.Writer;

public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    // 创建HTML文档的标题
    public void title(String title) throws Exception {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }

    // 创建HTML文档的段落
    public void paragraph(String msg) throws Exception {
        writer.write("<p>" + msg + "</p>\n");
    }

    // 创建HTML文档中的链接
    public void link(String href, String caption) throws Exception {
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    // 创建HTML文档中的邮件链接
    public void mailto(String mailaddr, String username) throws Exception {
        link("mailto:" + mailaddr, username);
    }

    // 结束HTML文档
    public void close() throws Exception {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
