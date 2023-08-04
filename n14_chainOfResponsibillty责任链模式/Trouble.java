/**
 * 责任链模式 - Trouble类
 *
 * Trouble类表示出现的问题或疑难情况。每个问题有一个唯一的编号，可以通过 getNumber() 方法获取。
 */
package n14_chainOfResponsibillty责任链模式;

public class Trouble {
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    // 获取问题编号
    public int getNumber() {
        return number;
    }

    // 重写toString方法，用于打印问题的字符串表示
    public String toString() {
        return "[Trouble " + number + "]";
    }
}
