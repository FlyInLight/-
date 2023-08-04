/**
 * 中介者模式 - ColleagueTextField类
 *
 * ColleagueTextField类是一个具体的同事类，继承了TextField类并实现了TextListener接口和Colleague接口。
 * 在这个例子中，ColleagueTextField表示一个文本输入框控件，它与中介者进行交互，通过中介者来控制自身的状态和行为。
 */
package n16_mediator中介者模式;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    // 设置中介者
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // 设置文本输入框是否可用，并根据可用状态设置背景色
    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    // 当文本输入框的文本内容发生变化时，通知中介者
    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }
}
