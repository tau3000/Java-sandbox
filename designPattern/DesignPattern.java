import singleton.*;
import factorymethod.*;
import abstractfactory.*;
import prototype.*;
import composite.*;
import adapter.*;
import proxy.*;
import bridge.*;

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
    }
}