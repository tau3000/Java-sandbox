package adapter;

public class AdapterTest{
    public void test(){
        System.out.println("Adapter Test");
        MikuAppend miku = new HatsuneMikuV3();
        miku.sing();
    }
}