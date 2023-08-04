/**
 * 上下文类 - 安全系统界面（SafeFrame）
 * <p>
 * SafeFrame是状态模式中的上下文类，表示安全系统的界面。在安全系统界面中，有使用金库、按下警铃、正常通话和结案四个按钮，点击按钮会触发不同的操作，具体操作会根据当前状态而变化。
 */
package n19_state状态模式;

import java.awt.*;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {
    private static final long serialVersionUID = -824973478009267888L;
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);
    private Button buttonUse = new Button("使用金库");
    private Button buttonAlarm = new Button("按下警铃");
    private Button buttonPhone = new Button("正常通话");
    private Button buttonExit = new Button("结案");
    private State state = DayState.getInstance();

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);
        pack();
        show();
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    // 点击按钮触发的操作
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == buttonUse) {
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }

    // 设置时间，更新时钟文本并调用状态的doClock方法
    @Override
    public void setClock(int hour) {
        String clockstring = "现在时间是：";
        if (hour < 10) {
            clockstring += "0" + hour + ":00";
        } else {
            clockstring += hour + ":00";
        }
        System.out.println(clockstring);
        textClock.setText(clockstring);
        state.doClock(this, hour);
    }

    // 改变状态，输出状态变化信息
    @Override
    public void changeState(State state) {
        System.out.println("从" + this.state + "状态变为了" + state + "状态。");
        this.state = state;
    }

    // 调用安全中心的方法，显示警报信息
    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n");
    }

    // 记录日志，显示操作信息
    @Override
    public void recordLog(String msg) {
        textScreen.append("record ... " + msg + "\n");
    }
}
