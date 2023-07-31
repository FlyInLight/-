/**
 * 客户端类（Client）。
 *
 * 在适配器模式中，Main类是客户端类，用于演示适配器模式的使用。
 * 客户端通过创建适配器对象，将被适配的类的接口转换成目标接口，并调用目标接口的方法来实现功能。
 */
package adapter适配器模式.类适配器模式;

public class Main {
    public static void main(String[] args) {
        // 创建适配器对象，将被适配的类的接口转换成目标接口
        Print print = new PrintBanner("Hello");

        // 调用目标接口的方法来实现功能
        print.printWeak(); // 输出：(Hello)
        print.printStrong(); // 输出：*Hello*
    }
}
