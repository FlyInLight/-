/**
 * 中介者模式 - ColleagueButton类
 *
 * ColleagueButton类是一个具体的同事类，继承了Button类并实现了Colleague接口。
 * 在这个例子中，ColleagueButton表示一个按钮控件，它与中介者进行交互，通过中介者来控制自身的状态和行为。
 */
package n16_mediator中介者模式;

import java.awt.*;

public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    // 设置中介者
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // 设置按钮是否可用
    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
