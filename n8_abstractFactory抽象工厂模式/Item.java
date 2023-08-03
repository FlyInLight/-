/**
 * 抽象产品类（Abstract Product）。
 * <p>
 * 在抽象工厂模式中，Item类是抽象产品类，它定义了具体产品（Link、Tray等）的公共接口。
 * 具体产品类将继承自Item类并实现具体的功能，从而创建具体的产品对象。
 */
package n8_abstractFactory抽象工厂模式;

public abstract class Item {
    protected String caption; // 产品的标题

    /**
     * 构造函数，用于初始化产品的标题。
     *
     * @param caption 产品的标题
     */
    public Item(String caption) {
        this.caption = caption;
    }

    /**
     * 抽象方法，用于生成产品的HTML格式代码。
     *
     * 具体的产品类将实现这个抽象方法，根据产品的类型和属性生成对应的HTML格式代码，并返回。
     *
     * @return 产品的HTML格式代码
     */
    public abstract String makeHTML();
}
