/**
 * 主函数类 - Main
 * <p>
 * 在Main类中，我们创建了一个RandomNumberGenerator对象，以及两个具体的观察者DigitObserver和GraphObserver，
 * 然后将这两个观察者添加到RandomNumberGenerator对象的观察者列表中，并调用generator的execute方法来生成随机数并通知观察者。
 */
package n17_observer观察者模式;

public class Main {
    public static void main(String[] args) {
        // 创建RandomNumberGenerator对象
        RandomNumberGenerator generator = new RandomNumberGenerator();

        // 创建两个具体的观察者：DigitObserver和GraphObserver
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        // 将两个观察者添加到RandomNumberGenerator对象的观察者列表中
        generator.addObserver(observer1);
        generator.addObserver(observer2);

        // 生成随机数并通知观察者
        generator.execute();
    }
}
