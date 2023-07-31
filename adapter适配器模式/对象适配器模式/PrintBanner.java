/**
 * 适配器类（Adapter）。
 *
 * 在适配器模式中，PrintBanner类是适配器类，它继承了目标抽象类Print，并将被适配的类Banner对象组合进来。
 * PrintBanner类的作用是将被适配的类Banner的接口转换成目标抽象类Print，使得客户端可以通过目标抽象类来调用
 * 被适配类的功能，而无需直接依赖于被适配类。
 */
package adapter适配器模式.对象适配器模式;

public class PrintBanner extends Print {
    private Banner banner;

    /**
     * 构造函数，用于创建一个适配器对象。
     *
     * @param string 要显示的字符串
     */
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    /**
     * 实现目标抽象类中的printWeak()方法，调用被适配类中的showWithParen()方法，实现弱化显示。
     */
    public void printWeak() {
        banner.showWithParen();
    }

    /**
     * 实现目标抽象类中的printStrong()方法，调用被适配类中的showWithAster()方法，实现强化显示。
     */
    public void printStrong() {
        banner.showWithAster();
    }

    // 其他可能的方法...
}
