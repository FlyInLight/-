/**
 * 策略模式 - WinningStrategy类
 *
 * 这个类实现了 Strategy 接口，表示一种策略：根据上一次的胜利情况来决定下一次出的手势。
 */
package n10_strategy策略模式;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    public void study(boolean win) {
        won = win;
    }
}
