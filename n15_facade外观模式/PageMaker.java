/**
 * 外观模式 - PageMaker类
 * <p>
 * PageMaker类是一个外观类，封装了生成欢迎页面的细节，使得生成欢迎页面的过程更加简便。
 * 它通过调用Database类和HtmlWriter类来实现生成欢迎页面的功能。
 */
package n15_facade外观模式;

import java.io.FileWriter;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    // 生成欢迎页面的方法
    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            // 从maildata.properties中读取邮件地址对应的用户名
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);

            // 创建一个HtmlWriter对象，将生成的HTML写入指定的文件中
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));

            // 生成HTML文档的标题和内容
            writer.title("Welcome to " + username + "'s page");
            writer.paragraph("欢迎欢迎，热烈欢迎。");
            writer.paragraph("等热炒饭，再等热炒饭。");

            // 生成HTML文档中的邮件链接
            writer.mailto(mailaddr, "欢迎欢迎，热烈欢迎。");

            // 结束HTML文档的生成
            writer.close();

            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
