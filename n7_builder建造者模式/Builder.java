/**
 * 抽象建造者类（Abstract Builder）。
 * <p>
 * 在建造者模式中，Builder类是抽象建造者类，它声明了用于构建产品的抽象方法。
 */
package n7_builder建造者模式;

public abstract class Builder {
    /**
     * 抽象方法：构建产品的标题部分。
     * 由具体子类实现，用于设置产品的标题。
     *
     * @param title 产品的标题
     */
    public abstract void makeTitle(String title);

    /**
     * 抽象方法：构建产品的字符串部分。
     * 由具体子类实现，用于添加产品的字符串内容。
     *
     * @param str 产品的字符串内容
     */
    public abstract void makeString(String str);

    /**
     * 抽象方法：构建产品的条目部分。
     * 由具体子类实现，用于添加产品的条目内容。
     *
     * @param items 产品的条目内容数组
     */
    public abstract void makeItems(String[] items);

    /**
     * 抽象方法：完成构建产品的方法。
     * 由具体子类实现，用于完成构建产品的最后一步操作。
     */
    public abstract void close();
}
