/**
 * 抽象的主题 - NumberGenerator
 * <p>
 * NumberGenerator是一个抽象的主题，它包含了观察者的管理逻辑和通知逻辑。
 * 具体的主题类（如RandomNumberGenerator）需要继承自NumberGenerator，并实现其中的抽象方法。
 */
package n17_observer观察者模式;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList<>();

    // 添加观察者
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // 删除观察者
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    // 通知所有观察者
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    // 获取当前的数字
    public abstract int getNumber();

    // 产生数字
    public abstract void execute();
}
