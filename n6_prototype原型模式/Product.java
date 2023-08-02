/**
 * 抽象原型类（Abstract Prototype）。
 *
 * 在原型模式中，Product接口是抽象原型类，它继承了Cloneable接口，
 * 并声明了用于使用产品和创建克隆对象的抽象方法。
 */
package n6_prototype原型模式;

public interface Product extends Cloneable {
    /**
     * 抽象方法：使用产品。
     * 由具体子类实现，用于使用产品并输出相应的内容。
     *
     * @param s 要使用的产品内容
     */
    public abstract void use(String s);

    /**
     * 抽象方法：创建克隆对象。
     * 由具体子类实现，用于创建该产品的克隆对象。
     *
     * @return 创建的克隆对象
     */
    public abstract Product createClone();
}
