/**
 * 单例模式类（Singleton）。
 *
 * 在单例模式中，Singleton类是一个单例类，它只能创建一个实例对象，
 * 并提供了一个静态方法getInstance()用于获取该唯一实例。
 */
package n5_singleton单例模式;

public class Singleton {
    /**
     * 静态常量：唯一实例。
     * 在类加载时即被创建，并初始化为一个唯一的实例。
     */
    private static final Singleton instance = new Singleton();

    /**
     * 私有构造函数。
     * 单例类的构造函数必须私有化，确保只能在类内部创建实例。
     */
    private Singleton() {
        // 私有化构造函数，防止外部直接实例化该类
    }

    /**
     * 静态方法：获取唯一实例。
     * 提供静态方法用于外部获取该唯一实例。
     *
     * @return 唯一实例
     */
    public static Singleton getInstance() {
        return instance;
    }
}
