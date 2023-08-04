/**
 * 访问者模式 - Element接口
 *
 * Element接口是访问者模式中的元素接口，用于定义元素类的通用接口方法。
 * 所有的元素类（比如Directory、File等）都需要实现该接口，以便接受访问者的访问。
 */
package n13_visitor访问者模式;

public interface Element {
    // 接受访问者的访问
    void accept(Visitor visitor);
}
