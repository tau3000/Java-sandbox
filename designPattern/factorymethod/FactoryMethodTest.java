package factorymethod;

import java.lang.Integer;
import java.lang.System;
import java.util.Arrays;
import java.util.List;

public class FactoryMethodTest{
    public void test(){
        System.out.println("FactoryMethod Test");

        List<Integer> list = Arrays.asList(2,5,8,3,1,4,7,6,0,9);
        System.out.println("昇順表示");
        new AscendingOrderListPrinter().printList(list);
    }
}