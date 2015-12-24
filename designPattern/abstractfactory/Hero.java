package abstractfactory;

import java.lang.Integer;
import java.lang.String;
import java.lang.System;

//ConcreteProduct
public class Hero extends LeadingActor{
    public Hero(String name){
        super(name);
    }

    public void say(){
        System.out.println(name + "が主人公です");
    }
}