/**
 * 代理模式示例 - Main
 *
 * 在该示例中，我们演示了代理模式的使用。代理模式是结构型设计模式，用于提供一个代理对象来控制对真实对象的访问。在这个示例中，我们有一个打印机的接口(Printable)和一个实际的打印机类(RealPrinter)。同时，我们创建了一个代理打印机类(PrinterProxy)，它实现了打印机接口，并在其中控制对实际打印机类的访问。主要目的是在不直接访问实际打印机对象的情况下，通过代理对象来进行打印操作，并且可以在代理对象中添加一些额外的功能。
 */
package n21_proxy代理模式;

public class Main {
    public static void main(String[] args) {
        // 创建一个打印机代理对象，并设置名字为"Alice"
        Printable printable = new PrinterProxy("Alice");

        // 输出当前的打印机名字
        System.out.println("现在的名字是：" + printable.getPrinterName());

        // 设置打印机名字为"Bob"
        printable.setPrinterName("Bob");

        // 再次输出当前的打印机名字
        System.out.println("现在的名字是：" + printable.getPrinterName());

        // 使用代理对象进行打印操作
        printable.print("Hello, world.");
    }
}
