package state;

import java.util.Random;

public class StateTest{
    public void test(){
        System.out.println("State Test");

        Random rand = new Random();
        Context context = new Context();

        int temp = 0;
        int condition = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("--------------------");
            temp = rand.nextInt(10);
            System.out.println(i + " 回目: " + temp);
            condition = temp % 2;
            System.out.println("        : " + condition);
            context.showCondition(condition);
            context.showSaying();
        }
    }
}
