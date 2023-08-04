/**
 * 中介者模式 - Colleague接口
 *
 * Colleague接口是同事类的接口，定义了同事类的通用行为。
 * 具体的同事类将实现该接口，并通过该接口与中介者进行交互。
 */
package n16_mediator中介者模式;

public interface Colleague {
    // 设置中介者
    void setMediator(Mediator mediator);

    // 设置同事类是否可用
    void setColleagueEnabled(boolean enabled);
}
