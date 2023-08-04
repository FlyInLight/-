/**
 * 访问者模式 - Directory类
 *
 * Directory类表示文件夹，它继承自Entry类，用于存储文件夹的名称和包含的子元素（Entry对象）。
 */
package n13_visitor访问者模式;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    // 获取文件夹的名称
    @Override
    public String getName() {
        return name;
    }

    // 获取文件夹的大小，即所有子元素的大小之和
    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> it = dir.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            size += entry.getSize();
        }
        return size;
    }

    // 添加子元素到文件夹中
    @Override
    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    // 获取文件夹的子元素的迭代器
    @Override
    public Iterator<Entry> iterator() throws FileTreatmentException {
        return dir.iterator();
    }

    // 接受访问者的访问
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
