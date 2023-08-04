/**
 * 享元模式 - Flyweight
 * BigChar类是表示“大字符”的类，它在内部加载了一个字体文件，以实现共享。
 */
package n20_flyWeight享元模式;

import java.io.*;

public class BigChar {
    private char charname;
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        try {
            File file = new File("big-" + charname + ".txt");
            if (!file.exists()) {
                // 文件不存在，则创建新文件
                file.createNewFile();
                FileWriter writer = new FileWriter(file);
                // 写入字符的数据，此处使用 charname 作为示例
                writer.write(charname);
                writer.close();
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            StringBuilder buf = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.print(fontdata);
    }
}
