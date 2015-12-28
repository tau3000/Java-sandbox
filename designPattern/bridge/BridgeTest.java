package bridge;

import java.lang.System;

public class BridgeTest{
    public void test(){
        System.out.println("Bridge Test");

        Abstraction abstraction = new Abstraction(new ConcreteImplementor());
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(new ConcreteImplementor());
        abstraction.abstractionMethod();
        refinedAbstraction.abstractionMethod();
        refinedAbstraction.refinedMethod();
    }
}

//参考
// http://www.itsenka.com/contents/development/designpattern/bridge.html