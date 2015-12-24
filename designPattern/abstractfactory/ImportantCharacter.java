package abstractfactory;

import java.lang.Integer;
import java.lang.String;
import java.lang.System;

//ConcreteProduct
public class ImportantCharacter extends SupportingActor{
    public ImportantCharacter(String name){
        super(name);
    }

    public void say(){
        System.out.println(name + "は重要な登場人物です");
    }
}