/**
 * 中介者模式 - ColleagueCheckbox类
 *
 * ColleagueCheckbox类是一个具体的同事类，继承了Checkbox类并实现了ItemListener接口和Colleague接口。
 * 在这个例子中，ColleagueCheckbox表示一个复选框控件，它与中介者进行交互，通过中介者来控制自身的状态和行为。
 */
package n16_mediator中介者模式;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
    private Mediator mediator;

    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
        super(caption, group, state);
    }

    // 设置中介者
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // 设置复选框是否可用
    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    // 当复选框状态发生变化时，通知中介者
    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
