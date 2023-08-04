/**
 * 主程序 - 享元模式示例
 * <p>
 * 这是一个使用享元模式的示例程序。在该示例中，我们使用 BigString 类来创建一个大字符串，其中相同的字符会共享使用，以节省内存空间。
 * BigString 类内部使用了一个共享池（FlyweightFactory）来管理字符的共享和复用。当创建一个新的 BigString 对象时，
 * 如果字符串中的字符已经在共享池中存在，那么就会复用已有的字符对象，而不会再创建新的对象，从而减少内存的使用。
 */
package n20_flyWeight享元模式;

public class Main {
    public static void main(String[] args) {
        // 创建一个 BigString 对象，传入字符串 "hello"
        BigString bs = new BigString("hello\nworld");

        // 打印 BigString 对象，它会根据共享池中的字符对象进行打印
        bs.print();
    }
}
