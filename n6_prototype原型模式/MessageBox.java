/**
 * 具体原型类（Concrete Prototype）。
 * <p>
 * 在原型模式中，MessageBox类是具体原型类，它实现了Product接口，
 * 并提供了用于使用产品和创建克隆对象的方法。
 */
package n6_prototype原型模式;

public class MessageBox implements Product {
    private char decochar;

    /**
     * 构造函数，用于创建MessageBox对象。
     *
     * @param decochar 装饰字符，用于打印边框
     */
    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    /**
     * 使用MessageBox，输出带边框的字符串。
     *
     * @param s 要输出的字符串
     */
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
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
