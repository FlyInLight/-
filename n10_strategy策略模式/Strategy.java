/**
 * 策略模式 - Strategy接口
 *
 * 这个接口定义了策略的两个方法：nextHand() 和 study()。
 */
package n10_strategy策略模式;

public interface Strategy {
    // 下一次出的手势
    public abstract Hand nextHand();

    // 学习并更新策略
    public abstract void study(boolean win);
}
