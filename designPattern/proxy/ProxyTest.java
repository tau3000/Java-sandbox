package proxy;

public class ProxyTest{
    public void test(){
        System.out.println("Proxy Test");
        Person client = new Client();

        client.interrogate1();
        client.interrogate2();
    }
}