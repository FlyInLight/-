/**
 * 抽象工厂类（Abstract Factory）。
 *
 * 在工厂方法模式中，Factory类是抽象工厂类，它定义了一个工厂方法create()，
 * 用于创建Product对象，同时定义了抽象方法createProduct()和registerProduct()，
 * 分别用于创建具体产品和注册产品。
 */
package factoryMethod工厂方法模式;

public abstract class Factory {
    /**
     * 工厂方法（Factory Method）：创建产品（Product）。
     * final修饰，不可被子类重写。
     *
     * @param owner 产品的拥有者（创建产品的参数）
     * @return 创建的产品对象
     */
    public final Product create(String owner) {
        Product p = createProduct(owner); // 调用具体子类的createProduct()方法，创建具体产品
        registerProduct(p); // 调用具体子类的registerProduct()方法，注册产品
        return p; // 返回创建的产品对象
    }

    /**
     * 抽象方法：创建产品（Product）。
     * 由具体子类实现，用于创建具体产品对象。
     *
     * @param owner 产品的拥有者（创建产品的参数）
     * @return 创建的具体产品对象
     */
    protected abstract Product createProduct(String owner);

    /**
     * 抽象方法：注册产品（Register Product）。
     * 由具体子类实现，用于注册产品到工厂中。
     *
     * @param product 要注册的产品对象
     */
    protected abstract void registerProduct(Product product);
}
