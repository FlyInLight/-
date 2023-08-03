/**
 * 具体建造者类（Concrete Builder）。
 * <p>
 * 在建造者模式中，TextBuilder类是具体建造者类，它继承自Builder抽象建造者类，
 * 并实现了构建产品的具体方法，用于生成文本格式的文档。
 */
package n7_builder建造者模式;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("==============================\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('■' + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append(" ・" + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("==============================\n");
    }

    /**
     * 获取生成的文本格式文档。
     *
     * @return 生成的文本格式文档内容
     */
    public String getResult() {
        return buffer.toString();
    }
}
