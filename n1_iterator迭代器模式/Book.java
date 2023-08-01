/**
 * 代表图书的类。
 *
 * 在迭代器模式中，Book类是聚合对象的元素类型。它代表了一个图书对象，
 * 拥有一个名称属性（name）作为图书的标识。
 */
package n1_iterator迭代器模式;

public class Book {
    private String name;

    /**
     * 构造函数，用于创建一个图书对象。
     *
     * @param name 图书名称
     */
    public Book(String name) {
        this.name = name;
    }

    /**
     * 获取图书名称。
     *
     * @return 图书名称
     */
    public String getName() {
        return name;
    }
}
