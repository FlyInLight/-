/**
 * 客户端类（Client）。
 *
 * 在迭代器模式中，Main类是客户端类，用于演示迭代器模式的使用。
 * 客户端通过创建一个具体聚合对象并获取其迭代器，遍历聚合对象中的元素，实现对聚合对象的遍历操作。
 */
package iterator迭代器模式;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // 创建一个具体聚合对象
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days（《环游世界80天》）"));
        bookShelf.appendBook(new Book("Bible（《圣经》）"));
        bookShelf.appendBook(new Book("Cinderella（《灰姑娘》）"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs（《长腿爸爸》）"));

        // 获取聚合对象的迭代器
        Iterator it = bookShelf.iterator();

        // 使用迭代器遍历聚合对象中的元素，并打印书名
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
