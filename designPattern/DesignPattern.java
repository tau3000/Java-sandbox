import singleton.*;
import factorymethod.*;
import abstractfactory.*;

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
    }
}