/**
 * 命令模式 - DrawCommand类
 *
 * DrawCommand类实现了Command接口，用于将绘制图形的操作封装成一个命令对象。
 * 在执行命令时，会调用Drawable接口的draw方法，实现图形的绘制。
 */
package n22_command命令模式;

import java.awt.*;

public class DrawCommand implements Command {
    protected Drawable drawable;
    private Point position;

    // 构造方法，传入Drawable对象和绘制的位置坐标
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    // 实现Command接口的执行方法，调用Drawable接口的draw方法绘制图形
    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
