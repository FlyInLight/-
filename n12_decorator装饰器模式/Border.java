/**
 * 装饰器模式 - Border类
 *
 * Border是一个抽象类，继承自Display类，并包含一个对Display对象的引用。
 * 它是装饰器模式中的装饰器基类，用于为其他具体装饰器提供共同的基础。
 */
package n12_decorator装饰器模式;

public abstract class Border extends Display {
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
