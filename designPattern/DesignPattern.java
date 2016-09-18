import abstractfactory.AbstractFactoryTest;
import bridge.BridgeTest;
import command.CommandTest;
import composite.CompositeTest;
import flyweight.FlyweightTest;
import multicast.MulticastTest;
import observer.ObserverTest;
import prototype.PrototypeTest;
import proxy.ProxyTest;
import state.StateTest;

public class DesignPattern {

    public static void main(String[] args) {
        // ここにデザインパターンのインスタンスを１つ作って実行。
        AbstractFactoryTest abstractFactoryTest = new AbstractFactoryTest();
        abstractFactoryTest.test();
        System.out.println();

        PrototypeTest prototypeTest = new PrototypeTest();
        prototypeTest.test();
        System.out.println();

        CompositeTest compositeTest = new CompositeTest();
        compositeTest.test();
        System.out.println();

        ProxyTest proxyTest = new ProxyTest();
        proxyTest.test();
        System.out.println();

        BridgeTest bridgeTest = new BridgeTest();
        bridgeTest.test();
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

        ObserverTest observerTest = new ObserverTest();
        observerTest.test();
        System.out.println();

        MulticastTest multicastTest = new MulticastTest();
        multicastTest.test();
    }
}
