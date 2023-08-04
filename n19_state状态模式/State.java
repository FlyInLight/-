/**
 * 状态接口 - State
 * <p>
 * State接口定义了安全系统中不同状态的行为。具体的状态类都会实现这个接口。
 */
package n19_state状态模式;

public interface State {
    void doClock(Context context, int hour);

    void doUse(Context context);

    void doAlarm(Context context);

    void doPhone(Context context);
}
