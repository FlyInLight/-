/**
 * 命令模式 - MacroCommand类
 *
 * MacroCommand类实现了Command接口，用于将多个命令对象封装成一个宏命令。
 * 它内部维护了一个命令的集合（使用Stack实现），并提供了添加命令、执行命令、撤销命令以及清除命令的方法。
 */
package n22_command命令模式;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command {
    // 命令的集合
    private Stack<Command> commands = new Stack<>();

    // 实现Command接口的执行方法，执行所有命令
    @Override
    public void execute() {
        Iterator<Command> it = commands.iterator();
        while (it.hasNext()) {
            it.next().execute();
        }
    }

    // 添加命令到命令集合
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    // 撤销（删除）最后一条命令
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    // 清除所有命令
    public void clear() {
        commands.clear();
    }
}
