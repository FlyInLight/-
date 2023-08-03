/**
 * 抽象产品类（Tray）。
 * <p>
 * 这是抽象工厂模式的抽象产品类，用于表示托盘（Tray）。
 */
package n8_abstractFactory抽象工厂模式;

import java.util.ArrayList;

public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();

    /**
     * 构造方法。
     *
     * @param caption 托盘的标题
     */
    protected Tray(String caption) {
        super(caption); // 调用父类Item的构造方法，初始化托盘的标题
    }

    /**
     * 添加条目到托盘中。
     *
     * @param item 要添加的条目
     */
    public void add(Item item) {
        tray.add(item); // 将条目添加到托盘的列表中
    }
}
