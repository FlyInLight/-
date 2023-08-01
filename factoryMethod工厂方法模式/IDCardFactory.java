/**
 * 具体工厂类（Concrete Factory）。
 *
 * 在工厂方法模式中，IDCardFactory类是具体工厂类，它继承了抽象工厂类Factory，
 * 并实现了其中的抽象方法createProduct()和registerProduct()，来创建和注册具体产品IDCard。
 * 同时，IDCardFactory类还添加了一个成员变量owners，用于保存已创建ID卡的拥有者列表。
 */
package factoryMethod工厂方法模式;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<String>();

    /**
     * 实现抽象方法：创建产品（createProduct）。
     * 在IDCardFactory中，调用IDCard的构造函数，创建IDCard对象。
     *
     * @param owner 产品的拥有者（创建产品的参数）
     * @return 创建的IDCard对象
     */
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    /**
     * 实现抽象方法：注册产品（registerProduct）。
     * 在IDCardFactory中，将IDCard的拥有者加入到已创建ID卡的拥有者列表中。
     *
     * @param product 要注册的产品对象
     */
    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    /**
     * 获取已创建ID卡的拥有者列表。
     *
     * @return 已创建ID卡的拥有者列表
     */
    public List<String> getOwners() {
        return owners;
    }
}
