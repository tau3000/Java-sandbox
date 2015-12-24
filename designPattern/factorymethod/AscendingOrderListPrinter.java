package factorymethod;

import java.lang.Integer;
import java.lang.Override;
import java.util.Comparator;

public class AscendingOrderListPrinter extends ListPrinter{
    @Override
    protected Comparator<Integer> createComparator(){
        return new AscendingOrderComparator();
    }
}