/**
 * 具体状态类 - 白天状态（DayState）
 * <p>
 * DayState是状态模式中的一个具体状态类，表示白天的状态。在白天状态下，不同的操作会触发不同的响应。
 */
package n19_state状态模式;

public class DayState implements State {
    private static DayState singleton = new DayState();

    private DayState() {
    }

    // 获取DayState的唯一实例
    public static State getInstance() {
        return singleton;
    }

    // 时间发生变化时的处理
    @Override
    public void doClock(Context context, int hour) {
        // 如果时间在9点之前或者17点及以后，则切换到夜晚状态
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    // 使用金库时的处理
    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库（白天）");
    }

    // 按下警铃时的处理
    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(白天)");
    }

    // 正常通话时的处理
    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话(白天)");
    }

    // 获取状态名称的字符串表示
    @Override
    public String toString() {
        return "[早上]";
    }
}
