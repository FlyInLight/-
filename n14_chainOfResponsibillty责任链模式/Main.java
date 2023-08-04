/**
 * 责任链模式 - Main类
 *
 * Main类是客户端程序，用于测试责任链模式的实现。
 * 在这个示例中，我们创建了不同类型的处理者，并组成一个处理链，每个处理者只能处理特定范围内的问题。
 * 然后，我们通过处理链来处理一系列问题，看哪个处理者能够解决这些问题。
 */
package n14_chainOfResponsibillty责任链模式;

public class Main {
    public static void main(String[] args) {
        // 创建不同类型的处理者
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);

        // 组成处理链
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

        // 处理一系列问题，看哪个处理者能够解决
        for (int i = 0; i < 500; i += 33) {
            alice.support(new Trouble(i));
            System.out.println("==================");
        }
    }
}
