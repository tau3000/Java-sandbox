import command.CommandTest;
import flyweight.FlyweightTest;
import multicast.MulticastTest;
import proxy.ProxyTest;
import state.StateTest;

public class DesignPattern {

    public static void main(String[] args) {
        // ここにデザインパターンのインスタンスを１つ作って実行。
        ProxyTest proxyTest = new ProxyTest();
        proxyTest.test();
        System.out.println();

        FlyweightTest flyweightTest = new FlyweightTest();
        flyweightTest.test();
        System.out.println();

        CommandTest commandTest = new CommandTest();
        commandTest.test();
        System.out.println();

        StateTest stateTest = new StateTest();
        stateTest.test();
        System.out.println();

        MulticastTest multicastTest = new MulticastTest();
        multicastTest.test();
    }
}
