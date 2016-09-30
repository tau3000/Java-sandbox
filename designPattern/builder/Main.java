package builder;

public class Main {
    public static void main(String[] args) {
        // titleを使用する場合
        final User user = new User.Builder("testName", 24).title("CEO").build();
        System.out.println(user);

        System.out.println();

        // titleを使用しない場合
        final User user2 = new User.Builder("testName", 24).build();
        System.out.println(user2);
    }
}
