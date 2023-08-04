package n22_command命令模式;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowListener;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    // 绘制的历史记录
    private MacroCommand history = new MacroCommand();
    // 绘制区域
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // 删除按钮
    private JButton deleteButton = new JButton("删除");

    // 构造函数
    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        deleteButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(deleteButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        show();
    }

    // ActionListener接口中的方法
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == deleteButton) {
            history.clear();
            canvas.repaint();
        }
    }


    // MouseListener接口中的方法
    public void mouseMoved(java.awt.event.MouseEvent e) {

    }

    public void mouseDragged(java.awt.event.MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    // WindowListener接口中的方法
    public void windowClosing(java.awt.event.WindowEvent e) {
        System.exit(0);
    }

    public void windowActivated(java.awt.event.WindowEvent e) {

    }

    public void windowClosed(java.awt.event.WindowEvent e) {

    }

    public void windowDeactivated(java.awt.event.WindowEvent e) {

    }

    public void windowDeiconified(java.awt.event.WindowEvent e) {

    }

    public void windowIconified(java.awt.event.WindowEvent e) {

    }

    public void windowOpened(java.awt.event.WindowEvent e) {

    }

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
