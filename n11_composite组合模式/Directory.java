/**
 * 组合模式 - Directory类
 *
 * Directory类表示一个目录，它是Entry类的子类，具有添加子条目和获取目录大小的功能。
 */
package n11_composite组合模式;

public class Directory extends Entry {
    private String name;
    private Entry[] directory;
    private int size;

    public Directory(String name) {
        this.name = name;
        directory = new Entry[10];
        size = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (int i = 0; i < directory.length; i++) {
            if (directory[i] != null) {
                size += directory[i].getSize();
            }
        }
        return size;
    }

    public Entry add(Entry entry) {
        directory[size++] = entry;
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (int i = 0; i < directory.length; i++) {
            if (directory[i] != null) {
                directory[i].printList(prefix + "/" + name);
            }
        }
    }
}
