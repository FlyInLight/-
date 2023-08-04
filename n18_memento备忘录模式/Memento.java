/**
 * 备忘录类 - Memento
 * <p>
 * Memento类代表备忘录，用于保存发起人（Gamer）的状态。它具有获取金钱和水果的方法，并可以添加水果。
 */
package n18_memento备忘录模式;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private int money; // 保存的金钱
    private ArrayList<String> fruits; // 保存的水果列表

    // 获取保存的金钱
    public int getMoney() {
        return money;
    }

    // 构造函数，创建备忘录对象时传入当前的金钱
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    // 添加水果
    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    // 获取保存的水果列表的副本
    List<String> getFruits() {
        return (List<String>) fruits.clone();
    }
}
