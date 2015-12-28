package proxy;

public class Client implements Person{
    private Person lawyer = new Lawyer();

    public void interrogate1(){
        System.out.println("クライアントが自分で答えました。");
    }

    public void interrogate2(){
        System.out.println("弁護士に頼んで答えてもらいました。");
        System.out.print("->");
        lawyer.interrogate2();
    }
}