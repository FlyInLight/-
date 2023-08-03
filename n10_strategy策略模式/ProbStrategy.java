/**
 * 策略模式 - ProbStrategy类
 *
 * 这个类是策略的一种具体实现，使用概率来决定下一次出的手势。
 */
package n10_strategy策略模式;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;                 // 随机数生成器
    private int prevHandValue = 0;         // 上一次出的手势
    private int currentHandValue = 0;      // 当前出的手势
    private int[][] history = {
            {1, 1, 1},                     // 历史胜负数据的记录
            {1, 1, 1},
            {1, 1, 1}
    };

    // 构造函数，初始化随机数生成器
    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    // 下一次出的手势，使用概率来决定
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handValue = 0;
        if (bet < history[currentHandValue][0]) {
            handValue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handValue = 1;
        } else {
            handValue = 2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handValue;
        return Hand.getHand(handValue);
    }

    // 计算历史胜负数据之和
    private int getSum(int hv) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[hv][i];
        }
        return sum;
    }

    // 学习并更新历史胜负数据
    public void study(boolean win) {
        if (win) {
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
