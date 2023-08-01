/**
 * 具体产品类（Concrete Product）。
 *
 * 在工厂方法模式中，IDCard类是具体产品类，它继承了抽象产品类Product，
 * 并实现了其中的抽象方法use()，来定义自己的具体功能。
 */
package factoryMethod工厂方法模式;

public class IDCard extends Product {
    private String owner;

    /**
     * 构造函数，用于创建一个IDCard对象。
     *
     * @param owner 拥有者的名称
     */
    IDCard(String owner) {
        System.out.println("制件" + owner + "的ID卡。");
        this.owner = owner;
    }

    /**
     * 实现抽象方法：使用产品（use）。
     * 在IDCard中，实现了使用ID卡的具体功能。
     */
    public void use() {
        System.out.println("使用" + owner + "的ID卡。");
    }

    /**
     * 获取拥有者的名称。
     *
     * @return 拥有者的名称
     */
    public String getOwner() {
        return owner;
    }
}
