/**
 * 被适配的类（Adaptee）。
 *
 * 在适配器模式中，Banner类是被适配的类，它拥有一个字符串属性，提供了两种不同的打印方式：括号包裹和星号包裹。
 *
 * 这个类是我们需要使用的旧接口或旧组件，但是由于它的接口和我们需要的目标接口不兼容，需要通过适配器来进行转换。
 */
package n2_adapter适配器模式.对象适配器模式_委托;

public class Banner {
    private String string;

    /**
     * 构造函数，用于创建一个Banner对象。
     *
     * @param string 要显示的字符串
     */
    public Banner(String string) {
        this.string = string;
    }

    /**
     * 显示字符串，使用括号包裹。
     */
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    /**
     * 显示字符串，使用星号包裹。
     */
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }

    // 其他可能的方法...
}
