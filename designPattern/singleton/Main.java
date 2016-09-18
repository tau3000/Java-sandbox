package singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Singleton Test");
        WikiContents alone1 = WikiContents.getInstance();
        WikiContents alone2 = WikiContents.getInstance();
        if (alone1 == alone2) {
            System.out.println("同じインスタンスです");
        }

        alone1.setTitle("Company");
        alone2.setContent("会社概要、プレイヤー一覧、財務諸表");

        System.out.println("alone1");
        System.out.println(alone1.getTitle());
        System.out.println(alone1.getContent());
        System.out.println("alone2");
        System.out.println(alone2.getTitle());
        System.out.println(alone2.getContent());

    }
}
