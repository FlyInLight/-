/**
 * Command Pattern Sample
 *
 * 这是一个演示命令模式的示例程序，用于实现绘图应用的历史记录和撤销功能。
 * 它创建了一个绘图应用的主窗口，包含一个绘图区域 DrawCanvas 和一个删除按钮 deleteButton。
 * DrawCanvas 负责绘制图形，并通过 MouseMotionListener 来监听鼠标拖动事件，当拖动鼠标时会创建 DrawCommand 命令并将其添加到 MacroCommand 历史记录中。
 * deleteButton 负责清空历史记录，从而实现撤销功能。
 *
 * 主类 Main 实现了 ActionListener、MouseMotionListener 和 WindowListener 接口，分别处理删除按钮点击事件、鼠标拖动事件和窗口关闭事件。
 * 在删除按钮点击事件中，清空历史记录并重绘绘图区域。
 * 在鼠标拖动事件中，创建 DrawCommand 命令并将其添加到历史记录中，并执行该命令来绘制图形。
 * 在窗口关闭事件中，关闭程序。
 */
package n22_command命令模式;

import javax.swing.*;
import java.awt.event.ActionListener;
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

    // MouseMotionListener接口中的方法
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
