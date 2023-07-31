/**
 * 图书架迭代器类。
 *
 * 在迭代器模式中，BookShelfIterator类是迭代器对象的具体实现，用于遍历图书架中的图书。
 * BookShelfIterator类实现了Iterator接口，提供了 hasNext() 和 next() 方法，用于遍历图书架。
 */
package iterator迭代器模式;

import java.util.Iterator;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    /**
     * 构造函数，用于创建一个图书架的迭代器对象。
     *
     * @param bookShelf 要遍历的图书架对象
     */
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /**
     * 判断是否还有下一个图书。
     *
     * @return 如果还有下一个图书则返回true，否则返回false
     */
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取下一个图书对象。
     *
     * @return 下一个图书对象
     */
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }

    /**
     * 实现了Iterator接口的remove()方法，但当前迭代器不支持该操作，因此空实现。
     */
    public void remove() {
        // 空实现
    }
}
