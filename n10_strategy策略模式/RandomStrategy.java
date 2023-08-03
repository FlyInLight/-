package n10_strategy策略模式;

import java.util.Random;

public class RandomStrategy implements Strategy {
    private Random random;

    public RandomStrategy() {
        this.random = new Random();
    }

    public Hand nextHand() {
        int handValue = random.nextInt(3);
        return Hand.getHand(handValue);
    }

    public void study(boolean win) {
        // 对于随机策略，不需要学习和调整策略
    }
}
