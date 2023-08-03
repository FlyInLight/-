/**
 * 桥接模式 - 客户端代码。
 *
 * 在这个示例中，我们使用桥接模式来实现不同的显示方式。
 */
package n9_Bridge桥接模式;

public class Main {
    public static void main(String[] args) {
        // 创建具体实现化对象
        DisplayImpl stringDisplayImpl = new StringDisplayImpl("Hello, China.");
        DisplayImpl stringDisplayImpl2 = new StringDisplayImpl("Hello, World.");

        // 创建抽象化对象并使用具体实现化对象来初始化
        Display d1 = new Display(stringDisplayImpl);
        CountDisplay d2 = new CountDisplay(stringDisplayImpl2);
        CountDisplay d3 = new CountDisplay(stringDisplayImpl2);

        // 调用不同的显示方法
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
