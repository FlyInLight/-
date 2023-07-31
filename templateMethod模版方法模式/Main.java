/**
 * 客户端类（Client Class）。
 *
 * 在模板方法模式中，Main类是客户端类，它用于测试模板方法的具体子类的实现效果。
 */
package templateMethod模版方法模式;

public class Main {
    public static void main(String[] args) {
        // 创建具体子类对象
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, World.");
        AbstractDisplay d3 = new StringDisplay("今天天气不错");

        // 调用模板方法，执行具体算法
        d1.display();
        d2.display();
        d3.display();
    }
}
