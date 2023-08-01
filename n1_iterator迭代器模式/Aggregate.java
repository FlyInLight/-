/**
 * 定义迭代器模式中的聚合接口。
 *
 * 聚合接口（Aggregate）是迭代器模式的关键组成部分，它声明了一个抽象方法 iterator()，
 * 该方法用于获取迭代器对象，用于遍历聚合对象中的元素。
 *
 * 迭代器模式是一种行为型设计模式，它提供了一种统一的方式来遍历聚合对象中的元素，
 * 而无需暴露聚合对象的内部结构。
 *
 * 在实际使用中，具体的聚合类（ConcreteAggregate）将实现此接口，实现 iterator() 方法，
 * 返回一个具体的迭代器对象，用于遍历聚合对象中的元素。
 */
package n1_iterator迭代器模式;

import java.util.Iterator;

public interface Aggregate {
    /**
     * 获取迭代器对象，用于遍历聚合对象中的元素。
     *
     * @return 迭代器对象
     */
    Iterator iterator();
}
