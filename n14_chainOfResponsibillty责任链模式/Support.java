/**
 * 责任链模式 - Support类
 *
 * Support类是处理问题的抽象类，定义了处理问题的模板方法和责任链中的下一个处理者。
 * 每个处理者（子类）需要实现抽象方法 resolve()，根据自身能力判断是否能够解决问题。
 */
package n14_chainOfResponsibillty责任链模式;

public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    // 设置责任链中的下一个处理者
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    // 责任链中的处理方法，如果能够处理问题则调用done()，否则交给下一个处理者处理
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    // 返回处理者的名字
    public String toString() {
        return "[" + name + "]";
    }

    // 判断是否能够处理该问题的抽象方法，由子类实现
    protected abstract boolean resolve(Trouble trouble);

    // 处理问题的方法，由子类实现
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    // 无法处理问题时的方法，由子类实现
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
