/**
 * 打印机代理类 - PrinterProxy
 *
 * PrinterProxy类实现了Printable接口，用于代理真实的打印机Printer。
 */
package n21_proxy代理模式;

public class PrinterProxy implements Printable {
    private String name; // 打印机的名称
    private Printer real; // 真实的打印机对象

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name); // 创建真实的打印机对象，需要较长时间（重型作业）
        }
    }
}
