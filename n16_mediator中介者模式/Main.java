/**
 * 中介者模式示例
 * <p>
 * 在该示例中，我们实现了一个简单的登录窗口(LoginFrame)，其中包含了两个复选框（Guest和Login）、两个文本输入框（Username和Password）以及两个按钮（OK和Cancel）。
 * 这些组件是同事类，它们之间的交互由中介者来协调。
 * <p>
 * 中介者接口(Mediator)定义了中介者的功能，包括创建同事类和处理同事类状态变化的方法。
 * <p>
 * 中介者类(LoginFrame)实现了中介者接口，并具体实现了中介者的功能。它持有各个同事类的引用，并根据同事类的状态进行逻辑处理，从而实现各个同事类之间的协调和交互。
 * <p>
 * 同事类(Colleague)是一个接口，定义了同事类的基本行为和与中介者交互的方法。
 * <p>
 * 同事类的具体实现包括 ColleagueCheckbox(复选框)、ColleagueTextField(文本输入框) 和 ColleagueButton(按钮)。这些类实现了同事类接口，并在状态变化时通知中介者。
 * <p>
 * 在Main类中，我们创建了一个LoginFrame实例，并通过中介者模式来协调各个组件的交互。当Guest复选框被选中时，禁用Username和Password输入框，启用OK按钮；当Login复选框被选中时，启用Username输入框，根据Username和Password输入框的状态来启用或禁用OK按钮。
 */
package n16_mediator中介者模式;

public class Main {
    public static void main(String[] args) {
        new LoginFrame("Mediator Sample");
    }
}
