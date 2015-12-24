package factorymethod;

import java.lang.Integer;
import java.lang.Override;
import java.util.Comparator;

public class AscendingOrderComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer num1, Integer num2){
        return num1 - num2;
    }
}