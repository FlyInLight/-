/**
 * 组合模式 - File类
 *
 * File类是Entry的子类，表示文件类型的条目。
 */
package n11_composite组合模式;

public class File extends Entry {
    private String name; // 文件名称
    private int size; // 文件大小

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this); // 打印文件名称和大小
    }
}
