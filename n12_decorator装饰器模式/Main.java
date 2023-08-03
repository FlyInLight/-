/**
 * 装饰器模式 - Main类
 *
 * 在Main类中，我们使用了装饰器模式来对不同的组件进行装饰，使其具有不同的显示效果。
 */
package n12_decorator装饰器模式;

public class Main {
    public static void main(String[] args) {
        // 创建一个具体的组件类 StringDisplay
        Display b1 = new StringDisplay("Hello, world.");

        // 对 StringDisplay 进行装饰，加上 SideBorder
        Display b2 = new SideBorder(b1, '#');

        // 对加上 SideBorder 的组件进行装饰，再加上 FullBorder
        Display b3 = new FullBorder(b2);

        // 显示组件的内容，会根据装饰的效果显示不同的内容
        b1.show(); // 显示结果：Hello, world.
        b2.show(); // 显示结果：#Hello, world.#
        b3.show(); // 显示结果：+------------+\n|#Hello, world.#|\n+------------+

        // 进行多重装饰，先加上 FullBorder，再加上 SideBorder
        Display b4 = new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("今天天气真好呢。")
                                        ), '*'
                                )
                        )
                ), '/'
        );

        // 显示组件的内容，会根据多重装饰的效果显示不同的内容
        b4.show();
        // 显示结果：
        ///+------------------------------+/
        ///|+----------------------------+|/
        ///||*+------------------------+*||/
        ///||*|今天天气真好呢。|*||/
        ///||*+------------------------+*||/
        ///|+----------------------------+|/
        ///+------------------------------+/
    }
}
