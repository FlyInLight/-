/**
 * 具体的观察者 - GraphObserver
 * <p>
 * GraphObserver实现了Observer接口，它关注NumberGenerator产生的数字，并以图形的方式展示出来。
 */
package n17_observer观察者模式;

public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver: ");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
