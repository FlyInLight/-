/**
 * 桥接模式 - 具体实现化角色（StringDisplayImpl）。
 *
 * 这是具体的实现化角色，实现了在抽象化角色（Display）中声明的一组用于具体实现化的方法。
 * 这里的具体实现是针对字符串进行显示，通过在字符串前后添加边框来实现。
 */
package n9_Bridge桥接模式;

public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;

    /**
     * 构造函数，传入待显示的字符串。
     *
     * @param string 待显示的字符串
     */
    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    /**
     * 打开字符串的显示。
     * 在字符串前后添加边框并打印。
     */
    @Override
    public void rawOpen() {
        printLine();
    }

    /**
     * 打印字符串。
     * 在字符串前后添加边框并打印。
     */
    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    /**
     * 关闭字符串的显示。
     * 在字符串前后添加边框并打印。
     */
    @Override
    public void rawClose() {
        printLine();
    }

    /**
     * 打印边框线。
     * 根据字符串的长度打印相应数量的"-"字符，并在两端加上"+"
     */
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
