/**
 * 发起人类 - Gamer
 * <p>
 * Gamer类代表“游戏者”，它具有保存当前状态的功能，并可以从备忘录中恢复之前的状态。
 */
package n18_memento备忘录模式;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money; // 当前金钱
    private List<String> fruits = new ArrayList<>(); // 持有的水果列表
    private Random random = new Random(); // 随机数生成器
    private static String[] fruitsName = {
            "苹果", "葡萄", "香蕉", "橘子",
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    // 下注方法
    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("金钱增加100。");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("金钱减半。");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("获得了水果：" + f);
            fruits.add(f);
        } else {
            System.out.println("什么都没有发生。");
        }
    }

    // 保存当前状态并创建备忘录
    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            String f = it.next();
            if (f.startsWith("好吃的")) {
                m.addFruit(f);
            }
        }
        return m;
    }

    // 恢复之前的状态
    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "money = " + money + ", fruits = " + fruits;
    }

    // 随机获取一个水果
    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }
}
