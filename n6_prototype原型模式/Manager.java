/**
 * 原型管理类（Manager）。
 * <p>
 * 在原型模式中，Manager类是原型管理类，它用于管理原型对象，并提供了注册和创建克隆对象的方法。
 */
package n6_prototype原型模式;

import java.util.HashMap;

public class Manager {
    private HashMap showcase = new HashMap();

    /**
     * 注册原型对象的方法。
     * 将原型对象注册到管理类的HashMap中，以便后续创建克隆对象时使用。
     *
     * @param name   原型对象的名称
     * @param proto  原型对象
     */
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    /**
     * 创建克隆对象的方法。
     * 根据传入的原型对象名称，从HashMap中获取对应的原型对象，并调用其createClone()方法来创建克隆对象。
     *
     * @param protoname 原型对象的名称
     * @return 创建的克隆对象
     */
    public Product create(String protoname) {
        Product proto = (Product) showcase.get(protoname);
        return proto.createClone();
    }
}
