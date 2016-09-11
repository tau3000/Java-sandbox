import abstractfactory.AbstractFactoryTest;
import adapter.AdapterTest;
import bridge.BridgeTest;
import command.CommandTest;
import composite.CompositeTest;
import factorymethod.FactoryMethodTest;
import flyweight.FlyweightTest;
import multicast.MulticastTest;
import observer.ObserverTest;
import prototype.PrototypeTest;
import proxy.ProxyTest;
import singleton.SingletonTest;
import state.StateTest;
import templatemethod.TemplateMethodTest;

public class DesignPattern {

    public static void main(String[] args) {
        // ここにデザインパターンのインスタンスを１つ作って実行。
        SingletonTest singletonTest = new SingletonTest();
        singletonTest.test();
        System.out.println();

        FactoryMethodTest factoryMethodTest = new FactoryMethodTest();
        factoryMethodTest.test();
        System.out.println();

        AbstractFactoryTest abstractFactoryTest = new AbstractFactoryTest();
        abstractFactoryTest.test();
        System.out.println();

        PrototypeTest prototypeTest = new PrototypeTest();
        prototypeTest.test();
        System.out.println();

        CompositeTest compositeTest = new CompositeTest();
        compositeTest.test();
        System.out.println();

        AdapterTest adapterTest = new AdapterTest();
        adapterTest.test();
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

        TemplateMethodTest templateMethodTest = new TemplateMethodTest();
        templateMethodTest.test();
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