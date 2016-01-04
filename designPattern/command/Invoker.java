package command;

import java.util.Iterator;
import java.util.Stack;

public class Invoker{
    private Stack<Command> commands = new Stack<Command>();

    public void addCommand(Command command){
        commands.push(command);
    }

    public void undoCommand(){
        Command command = (Command)commands.pop();
        System.out.println("===undo===");
        command.execute();
        System.out.println("==========");
    }

    public void execute(){
        Iterator<Command> it = commands.iterator();
        while(it.hasNext()){
            it.next().execute();
        }
    }
}