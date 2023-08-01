/**
 * 客户端类（Client Class）。
 *
 * 在工厂方法模式中，Main类是客户端类，它用于测试工厂方法模式的具体实现。
 */
package factoryMethod工厂方法模式;

public class Main {
    public static void main(String[] args) {
        // 创建具体工厂对象
        Factory factory = new IDCardFactory();

        // 使用工厂方法创建具体产品
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小籍");
        Product card3 = factory.create("小小");

        // 使用具体产品
        card1.use();
        card2.use();
        card3.use();
    }
}
