/**
 * 责任链模式 - LimitSupport类
 *
 * LimitSupport类是具体的处理者，它继承自Support类，根据问题的大小判断是否能够处理该问题。
 */
package n14_chainOfResponsibillty责任链模式;

public class LimitSupport extends Support {
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    // 判断是否能够处理该问题的具体实现，问题的编号小于limit时返回true，否则返回false
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        } else {
            return false;
        }
    }
}
