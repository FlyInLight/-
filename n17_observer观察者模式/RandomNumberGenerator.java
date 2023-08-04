/**
 * 具体的主题 - RandomNumberGenerator
 *
 * RandomNumberGenerator是一个具体的主题，它继承自NumberGenerator抽象类，并实现了execute方法。
 * 在execute方法中，它会生成随机数，并将随机数通知给所有注册的观察者。
 */
package n17_observer观察者模式;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
