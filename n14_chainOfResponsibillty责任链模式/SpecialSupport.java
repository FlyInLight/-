/**
 * 责任链模式 - SpecialSupport类
 *
 * SpecialSupport类是具体的处理者，它继承自Support类，表示只能处理特定编号的问题。
 */
package n14_chainOfResponsibillty责任链模式;

public class SpecialSupport extends Support {
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    // 只能处理特定编号的问题，如果问题编号与特定编号相等则返回true，否则返回false
    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == number;
    }
}
