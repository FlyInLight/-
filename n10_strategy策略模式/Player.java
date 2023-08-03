/**
 * 策略模式 - Player类
 *
 * 这个类表示参与石头剪刀布游戏的玩家，包含了玩家的姓名、采用的策略、胜利、失败和游戏次数等信息。
 */
package n10_strategy策略模式;

public class Player {
    private String name;         // 玩家姓名
    private Strategy strategy;   // 玩家采用的策略
    private int winCount;        // 玩家胜利次数
    private int loseCount;       // 玩家失败次数
    private int gameCount;       // 玩家游戏总次数

    // 构造函数，初始化玩家姓名和策略
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    // 获取玩家下一次的手势
    public Hand nextHand() {
        return strategy.nextHand();
    }

    // 玩家胜利，调用策略的学习方法，并更新胜利次数和游戏次数
    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    // 玩家失败，调用策略的学习方法，并更新失败次数和游戏次数
    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    // 玩家平局，更新游戏次数
    public void even() {
        gameCount++;
    }

    // 返回玩家的统计信息字符串
    @Override
    public String toString() {
        return String.format("Player[%s, %d games, %d win, %d lose]", name, gameCount, winCount, loseCount);
    }
}
