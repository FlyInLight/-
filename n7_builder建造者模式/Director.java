/**
 * 导演类（Director）。
 * <p>
 * 在建造者模式中，Director类是导演类，它负责构建产品的过程。
 */
package n7_builder建造者模式;

public class Director {

    private Builder builder;

    /**
     * 构造函数，用于创建导演对象。
     *
     * @param builder 建造者对象，用于构建产品
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 构建产品的方法。
     * 调用建造者对象的各个方法，按照一定顺序构建产品。
     */
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早上到晚上");
        builder.makeItems(new String[]{
                "早上奋斗",
                "早上吃饭",
                "早上离家"
        });
        builder.makeString("晚上");
        builder.makeItems(new String[]{
                "晚上奋斗",
                "晚上吃饭",
                "晚上离家"
        });
        builder.close();
    }
}
