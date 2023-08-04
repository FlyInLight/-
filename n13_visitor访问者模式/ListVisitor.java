/**
 * 访问者模式 - ListVisitor类
 *
 * ListVisitor类是具体的访问者类之一，它继承了Visitor抽象类，并实现了抽象方法。
 * 在visit方法中，分别对File和Directory进行具体的访问操作，并输出当前的路径信息。
 * 对于Directory，它还会迭代其中的子元素，并对每个子元素递归调用accept方法，从而实现对整个结构的访问。
 */
package n13_visitor访问者模式;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentdir = "";

    // 对File进行访问，输出当前路径信息
    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    // 对Directory进行访问，输出当前路径信息，然后迭代其中的子元素进行递归调用
    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this); // 对子元素递归调用accept方法，让子元素接受访问者
        }
        currentdir = savedir;
    }
}
