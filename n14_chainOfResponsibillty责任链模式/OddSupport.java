/**
 * 责任链模式 - OddSupport类
 *
 * OddSupport类是具体的处理者，它继承自Support类，表示只能处理奇数编号的问题。
 */
package n14_chainOfResponsibillty责任链模式;

public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    // 只能处理奇数编号的问题，如果问题编号为奇数则返回true，否则返回false
    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 == 1;
    }
}
