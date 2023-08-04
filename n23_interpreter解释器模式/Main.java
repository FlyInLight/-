/**
 * 解释器模式示例的入口类
 *
 * Main类演示了解释器模式的使用。它从文件读取命令，并通过解释器模式解析命令并输出解析结果。
 * 在main方法中，它通过BufferedReader读取program.txt文件的内容，然后逐行解析命令。
 * 对于每一行命令，它首先输出原始文本内容，然后通过ProgramNode来解析命令，并输出解析结果。
 * 如果解析过程中出现了ParseException或IO异常，会打印异常堆栈信息。
 */
package n23_interpreter解释器模式;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/n23_interpreter解释器模式/program.txt"));
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
            reader.close();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
