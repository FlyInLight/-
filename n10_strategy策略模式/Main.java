/**
 * 策略模式 - Main类
 *
 * 在这个示例中，我们模拟了石头剪刀布游戏的多人对战场景。每个玩家都选择一种策略来决定下一步的手势，然后进行对战并计算最终的胜负结果。
 */
package n10_strategy策略模式;

public class Main {
    public static void main(String[] args) {
        // 创建三种不同的策略
        Strategy strategy = new ProbStrategy(1);
        Strategy strategy2 = new ProbStrategy(2);
        Strategy strategy3 = new RandomStrategy();

        // 创建三个玩家，并为每个玩家指定一个策略
        Player player = new Player("Player 1", strategy);
        Player player2 = new Player("Player 2", strategy2);
        Player player3 = new Player("Player 3", strategy3);

        // 进行10000次对战
        for (int i = 0; i < 10000; i++) {
            // 获取每个玩家的手势
            Hand hand = player.nextHand();
            Hand hand2 = player2.nextHand();
            Hand hand3 = player3.nextHand();

            // 判断胜负，并更新玩家的战绩
            if (hand.isStrongerThan(hand2)) {
                System.out.println("Winner: " + player);
                player.win();
                player2.lose();
                player3.lose();
            } else if (hand2.isStrongerThan(hand)) {
                System.out.println("Winner: " + player2);
                player.lose();
                player2.win();
                player3.lose();
            } else if (hand3.isStrongerThan(hand2)) {
                System.out.println("Winner: " + player3);
                player.lose();
                player2.lose();
                player3.win();
            } else {
                System.out.println("Even...");
                player.even();
                player2.even();
                player3.even();
            }
        }

        // 打印三个玩家的最终战绩
        System.out.println("Total result:");
        System.out.println(player);
        System.out.println(player2);
        System.out.println(player3);
    }
}
