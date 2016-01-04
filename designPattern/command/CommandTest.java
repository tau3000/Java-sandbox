package command;

public class CommandTest{
    public void test(){
        System.out.println("Command Test");

        Command[] commandsA = new Command[3];
        Command[] commandsB = new Command[3];

        Receiver receiver = new ConcreteReceiver();
        Invoker invoker = new Invoker();

        for(int i = 0; i < commandsA.length; i++){
            commandsA[i] = new ConcreteCommandA(i);
            commandsA[i].setReceiver(receiver);
            invoker.addCommand(commandsA[i]);
        }

        for(int i = 0; i < commandsB.length; i++){
            commandsB[i] = new ConcreteCommandB(i);
            commandsB[i].setReceiver(receiver);
            invoker.addCommand(commandsB[i]);
        }

        invoker.execute();
        invoker.undoCommand();
        invoker.execute();
    }
}

//参考
//http://www.ie.u-ryukyu.ac.jp/~e085739/java.it.16.html