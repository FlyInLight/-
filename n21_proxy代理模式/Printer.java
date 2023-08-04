/**
 * 打印机类 - Printer
 *
 * Printer类实现了Printable接口，表示真实的打印机。
 */
package n21_proxy代理模式;

public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("正在生成Printer实例");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("正在生成Printer实例(" + name + ")");
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(".");
        }
        System.out.println("结束。");
    }
}
