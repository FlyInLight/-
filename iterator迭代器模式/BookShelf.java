/**
 * 代表图书架（书架）的类。
 *
 * 在迭代器模式中，BookShelf类是聚合对象的具体实现，它代表了一个图书架，
 * 用于存放多本图书对象。BookShelf类实现了Aggregate接口，提供了获取迭代器对象的方法。
 */
package iterator迭代器模式;

import java.util.Iterator;

public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    /**
     * 构造函数，用于创建一个指定最大容量的图书架。
     *
     * @param maxsize 图书架的最大容量
     */
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    /**
     * 获取图书架中指定索引位置的图书对象。
     *
     * @param index 索引位置
     * @return 图书对象
     */
    public Book getBookAt(int index) {
        return books[index];
    }

    /**
     * 向图书架末尾添加一本图书。
     *
     * @param book 要添加的图书对象
     */
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    /**
     * 获取图书架中存放图书的数量。
     *
     * @return 存放图书的数量
     */
    public int getLength() {
        return last;
    }

    /**
     * 获取图书架的迭代器对象。
     *
     * @return 图书架的迭代器对象
     */
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
