/**
 * 具体状态类 - 夜晚状态（NightState）
 *
 * NightState是状态模式中的一个具体状态类，表示晚上的状态。在晚上状态下，不同的操作会触发不同的响应。
 */
package n19_state状态模式;

public class NightState implements State {
    private static NightState singleton = new NightState();

    private NightState() {
    }

    // 获取NightState的唯一实例
    public static State getInstance() {
        return singleton;
    }

    // 时间发生变化时的处理
    @Override
    public void doClock(Context context, int hour) {
        // 如果时间在9点至17点之间，则切换到白天状态
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    // 使用金库时的处理
    @Override
    public void doUse(Context context) {
        context.recordLog("紧急：晚上使用金库");
    }

    // 按下警铃时的处理
    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(晚上)");
    }

    // 正常通话时的处理
    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("晚上的通话录音");
    }

    // 获取状态名称的字符串表示
    public String toString() {
        return "[晚上]";
    }
}
