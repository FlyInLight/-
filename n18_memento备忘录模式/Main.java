/**
 * 客户端代码 - Main类
 *
 * 在Main类中，我们使用备忘录模式来模拟一个Gamer（玩家）在游戏中的状态变化和保存状态的过程。
 * 1. 首先，我们创建一个初始状态的Gamer对象，并获取其初始状态的备忘录。
 * 2. 然后，我们使用循环模拟Gamer在游戏中的状态变化，每次状态变化后，输出当前状态和所持金钱，并根据一定条件来决定是否保存当前状态或者恢复到之前的状态。
 * 3. 为了模拟状态变化的过程，我们使用了线程休眠来增加时间间隔。
 */

package n18_memento备忘录模式;

public class Main {
    public static void main(String[] args) {
        // 创建初始状态的Gamer对象，并获取初始状态的备忘录
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        // 模拟Gamer在游戏中的状态变化
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("当前状态：" + gamer);
            gamer.bet();
            System.out.println("所持金钱" + gamer.getMoney() + "元。");

            // 判断是否需要保存当前状态或者恢复到之前的状态
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    （所持金钱增加了，因此保存游戏状态）");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    （所持金钱减少了，因此将游戏恢复到之前的状态）");
                gamer.restoreMemento(memento);
            }

            try {
                // 线程休眠1秒钟，模拟状态变化的过程
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("");
        }
    }
}
