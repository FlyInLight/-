/**
 * 外观模式 - Database类
 * <p>
 * Database类是一个简单的数据库操作类，它通过静态方法提供获取数据库属性的功能。
 */
package n15_facade外观模式;

import java.util.Properties;

public class Database {
    private Database() {

    }

    // 通过传入数据库名字获取对应的数据库属性配置
    public static Properties getProperties(String dbname) {
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try {
            // 从文件中读取数据库属性配置
            prop.load(Database.class.getResourceAsStream(filename));
        } catch (Exception e) {
            // 如果文件未找到，则输出警告信息
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}
