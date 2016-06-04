package ramda;

import java.util.List;
import java.util.function.Supplier;

public class Provider{
    Expresstion expresstion = new Expresstion();
    private List<Supplier<String>> supplier;
    
    public Provider(List<Supplier<String>> supplier) {
        this.supplier = supplier;
    }
    
    public String call(int order){
        return supplier.get(order).get() + expresstion.call();
    }
    
    public int  size(){
        return supplier.size();
    }
}
