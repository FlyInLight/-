/**
 * 具体原型类（Concrete Prototype）。
 * <p>
 * 在原型模式中，UnderlinePen类是具体原型类，它实现了Product接口，
 * 并提供了用于创建克隆对象的createClone()方法。
 */
package n6_prototype原型模式;

public class UnderlinePen implements Product {
    private char ulchar;

    /**
     * 构造函数，用于创建UnderlinePen对象。
     *
     * @param ulchar 下划线字符
     */
    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    /**
     * 使用UnderlinePen，输出字符串和下划线。
     *
     * @param s 要输出的字符串
     */
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
    }

    /**
     * 创建克隆对象的方法。
     * 使用Object类的clone()方法来实现对象的浅拷贝，返回克隆后的Product对象。
     *
     * @return 克隆后的Product对象
     */
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
