/**
 * 责任链模式 - NoSupport类
 *
 * NoSupport类是具体的处理者，它继承自Support类，表示无法处理任何问题。
 */
package n14_chainOfResponsibillty责任链模式;

public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    // 无法处理任何问题，直接返回false
    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
