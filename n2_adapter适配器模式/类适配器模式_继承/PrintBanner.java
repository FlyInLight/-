/**
 * 适配器类（Adapter）。
 *
 * 在适配器模式中，PrintBanner类是适配器类，它实现了目标接口Print，并继承了被适配的类Banner。
 * PrintBanner类的作用是将被适配的类Banner的接口转换成目标接口Print，使得客户端可以通过目标接口来调用
 * 被适配类的功能，而无需直接依赖于被适配类。
 */
package n2_adapter适配器模式.类适配器模式_继承;

public class PrintBanner extends Banner implements Print {

    /**
     * 构造函数，用于创建一个适配器对象。
     *
     * @param string 要显示的字符串
     */
    public PrintBanner(String string) {
        super(string);
    }

    /**
     * 实现目标接口中的printWeak()方法，调用被适配类中的showWithParen()方法，实现弱化显示。
     */
    public void printWeak() {
        showWithParen();
    }

    /**
     * 实现目标接口中的printStrong()方法，调用被适配类中的showWithAster()方法，实现强化显示。
     */
    public void printStrong() {
        showWithAster();
    }

    // 其他可能的方法...
}
