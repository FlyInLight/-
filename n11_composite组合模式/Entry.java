/**
 * 组合模式 - Entry抽象类
 * <p>
 * Entry类是组合模式的基类，它定义了目录和文件共有的接口，并提供了默认实现。
 */
package n11_composite组合模式;

public abstract class Entry {
    public abstract String getName(); // 获取条目名称

    public abstract int getSize(); // 获取条目大小

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException(); // 默认实现为抛出异常，用于在File类中处理不支持该方法的情况
    }

    public void printList() {
        printList(""); // 默认实现为调用printList(String prefix)方法，并传入空的前缀
    }

    protected abstract void printList(String prefix); // 打印条目列表

    public String toString() {
        return getName() + " (" + getSize() + ")"; // 默认实现为返回条目的名称和大小
    }
}
