/**
 * 客户端代码。
 *
 * 在建造者模式中，Main类是客户端代码，用于测试建造者模式的实现。
 */
package n7_builder建造者模式;

public class Main {
    public static void main(String[] args) {
        // 创建TextBuilder对象
        TextBuilder textBuilder = new TextBuilder();
        // 创建Director对象，并将TextBuilder对象传入
        Director director = new Director(textBuilder);
        // 构建文本格式的文档
        director.construct();
        // 获取生成的文本格式文档内容
        String result = textBuilder.getResult();
        System.out.println(result);

        // 创建HTMLBuilder对象
        HTMLBuilder htmlBuilder = new HTMLBuilder();
        // 创建Director对象，并将HTMLBuilder对象传入
        Director director2 = new Director(htmlBuilder);
        // 构建HTML格式的文档
        director2.construct();
        // 获取生成的HTML文档文件名
        String filename = htmlBuilder.getResult();
        System.out.println(filename + "文件编写完成。");
    }
}
