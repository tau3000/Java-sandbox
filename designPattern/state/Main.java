package state;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        TabContext context = new TabContext();

        // ランダムに10回どのタブかが選ばれる
        for (int i = 0; i < 10; i++) {
            int condition = rand.nextInt(2);
            System.out.println(i + " 回目: " + condition);
            context.doClick(condition);
            System.out.println("--------------------");
        }
    }
}
