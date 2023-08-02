/**
 * 客户端测试类（Main）。
 * <p>
 * 在原型模式中，Main类是客户端测试类，用于测试原型模式的使用。
 */
package n6_prototype原型模式;

public class Main {
    public static void main(String[] args) {
        // ====== 有的案例把去掉了Product接口让原型直接实现Cloneable，通过一个初始化类来完成工作返回需要的内容对象 ======
        // 准备原型管理类和具体原型对象
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        // 注册具体原型对象到原型管理类
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // 使用原型管理类创建并使用克隆对象
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
    }
}
