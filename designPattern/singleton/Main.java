package singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Singleton Test");
        Alone alone1 = Alone.getInstance();
        Alone alone2 = Alone.getInstance();
        if(alone1 == alone2){
            System.out.println("同じインスタンスです");
        }
    }
}
