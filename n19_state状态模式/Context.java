/**
 * 上下文接口 - Context
 * <p>
 * Context接口定义了在状态模式中的上下文对象应该具有的方法。
 */
package n19_state状态模式;

public interface Context {
    // 设置当前时间（小时）
    void setClock(int hour);

    // 改变当前状态
    void changeState(State state);

    // 联系安全中心（模拟方法）
    void callSecurityCenter(String msg);

    // 记录日志（模拟方法）
    void recordLog(String msg);
}
