/**
 * 享元模式 - Flyweight
 * BigCharFactory类是享元模式的工厂类，负责创建和共享BigChar对象。
 */
package n20_flyWeight享元模式;

public class BigCharFactory {
    private java.util.HashMap<String, BigChar> pool = new java.util.HashMap<>();
    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
