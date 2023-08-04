/**
 * 可打印接口 - Printable
 *
 * Printable接口定义了打印机代理对象和真实打印机对象都应该具有的方法。
 */
package n21_proxy代理模式;

public interface Printable {
    // 设置打印机名称
    void setPrinterName(String name);

    // 获取打印机名称
    String getPrinterName();

    // 打印方法
    void print(String string);
}
