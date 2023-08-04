/**
 * 具体观察者类 - DigitObserver
 * <p>
 * DigitObserver是一个具体的观察者类，它实现了Observer接口。
 * 当观察的主题(NumberGenerator)状态发生变化时，DigitObserver会被通知并执行相应的更新操作。
 */
package n17_observer观察者模式;

public class DigitObserver implements Observer {
    // 实现update方法，当主题状态发生变化时，执行更新操作
    @Override
    public void update(NumberGenerator generator) {
        // 获取主题的状态并输出
        System.out.println("DigitObserver: " + generator.getNumber());
        try {
            // 模拟处理更新的耗时操作
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
