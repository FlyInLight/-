/**
 * 命令模式 - DrawCanvas类
 *
 * DrawCanvas类是一个画布类，继承了Canvas类并实现了Drawable接口。
 * 在这个例子中，DrawCanvas类用于绘制图形，它将绘制的命令保存在一个MacroCommand对象中，通过执行该MacroCommand对象来绘制图形。
 */
package n22_command命令模式;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    private Color color = Color.red;
    private int radius = 6;
    private MacroCommand history;

    // 构造方法，传入画布的宽度、高度和历史绘制命令对象
    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    // 绘制方法，将执行历史绘制命令对象
    public void paint(Graphics g) {
        history.execute();
    }

    // 实现Drawable接口的绘制方法，用于绘制图形
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

}
