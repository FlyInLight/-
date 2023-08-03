/**
 * 策略模式 - Hand类
 *
 * 这个类表示石头剪刀布游戏中的手势，并实现了判断手势的强弱、比较手势以及获取手势名称的功能。
 */
package n10_strategy策略模式;

public class Hand {
    public static final int HANDVALUE_GUU = 0; // 表示石头的手势值
    public static final int HANDVALUE_CHO = 1; // 表示剪刀的手势值
    public static final int HANDVALUE_PAA = 2; // 表示布的手势值

    private static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };

    private static final String[] name = {
            "石头", "剪刀", "布"
    };

    private int handvalue; // 手势值

    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }

    // 根据手势值获取对应的Hand对象
    public static Hand getHand(int handvalue) {
        return hand[handvalue];
    }

    // 判断当前手势是否强于传入的手势h
    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    // 判断当前手势是否弱于传入的手势h
    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    // 比较当前手势和传入的手势h，返回1表示当前手势胜利，返回-1表示当前手势失败，返回0表示平局
    private int fight(Hand h) {
        if (this == h) {
            return 0; // 平局
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1; // 胜利
        } else {
            return -1; // 失败
        }
    }

    // 获取手势对应的名称
    public String toString() {
        return name[handvalue];
    }
}
