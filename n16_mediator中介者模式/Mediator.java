/**
 * 中介者接口 - Mediator接口
 *
 * Mediator接口定义了中介者的功能，包括创建同事类和处理同事类状态变化的方法。
 */
package n16_mediator中介者模式;

public interface Mediator {
    // 创建各个同事类并设置中介者
    public abstract void createColleagues();

    // 当同事类状态发生变化时，通知中介者，中介者根据状态调整其他同事类的状态
    public abstract void colleagueChanged();
}
