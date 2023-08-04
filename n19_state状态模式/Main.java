/**
 * 状态模式 - State Pattern
 * <p>
 * 这是一个使用状态模式的示例。状态模式是一种行为设计模式，它允许对象在内部状态改变时改变它的行为。在状态模式中，对象将其行为委托给当前状态对象，从而实现不同状态下的不同行为。
 * 在本例中，我们通过状态模式来实现一个简单的安全系统，可以根据时间来切换白天和晚上的状态，并根据不同状态触发不同的行为。
 * <p>
 * 包含的类:
 * 1. Context接口 (Context): 定义了安全系统的上下文接口，用于在不同状态之间进行切换。
 * 2. State接口 (State): 定义了安全系统中不同状态的行为。
 * 3. DayState类: 白天状态类，实现了State接口，定义了白天状态下的行为。
 * 4. NightState类: 晚上状态类，实现了State接口，定义了晚上状态下的行为。
 * 5. SafeFrame类: 安全系统的界面类，实现了Context接口，用于显示安全系统的状态并响应用户操作。
 * 6. Main类: 主程序入口，用于运行示例代码。
 */
package n19_state状态模式;

public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);   // 设置时间，根据时间切换不同的状态
                try {
                    Thread.sleep(1000);  // 每隔一秒钟更新一次状态
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
