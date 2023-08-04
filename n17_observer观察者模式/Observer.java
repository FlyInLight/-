/**
 * 观察者接口 - Observer
 * <p>
 * Observer接口定义了一个update方法，当观察的主题状态发生变化时，具体的观察者会实现这个方法来执行相应的更新操作。
 */
package n17_observer观察者模式;

public interface Observer {
    // 更新方法，当观察的主题状态发生变化时，具体的观察者会实现这个方法来执行相应的更新操作
    void update(NumberGenerator generator);
}
