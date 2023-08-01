/**
 * 抽象产品类（Abstract Product）。
 *
 * 在工厂方法模式中，Product类是抽象产品类，它定义了一个抽象方法use()，
 * 用于在具体产品中实现不同的功能。
 */
package n4_factoryMethod工厂方法模式;

public abstract class Product {
    /**
     * 抽象方法：使用产品。
     * 由具体子类实现，用于在具体产品中实现不同的功能。
     */
    public abstract void use();
}
