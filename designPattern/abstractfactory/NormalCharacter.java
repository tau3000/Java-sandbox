package abstractfactory;

import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.util.AbstractCollection;

//ConcreteProduct
public class NormalCharacter extends SupportingActor{
    public NormalCharacter(String name){
        super(name);
    }

    public void say(){
        System.out.println(name + "は登場人物です");
    }
}