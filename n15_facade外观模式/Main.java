/**
 * 外观模式 - Main类
 * <p>
 * Main类是程序的入口，演示了如何使用外观模式生成欢迎页面。
 * 在Main类中，我们调用PageMaker类的makeWelcomePage方法，传入邮件地址和文件名作为参数，
 * PageMaker类内部会封装生成欢迎页面的细节，使得生成欢迎页面的过程更加简便。
 */
package n15_facade外观模式;

public class Main {
    public static void main(String[] args) {
        // 调用PageMaker类的makeWelcomePage方法，传入邮件地址和文件名
        // PageMaker类会根据邮件地址从maildata.properties文件中获取用户名，并生成相应的欢迎页面
        PageMaker.makeWelcomePage("蜡笔小新.com", "welcome.html");
    }
}
