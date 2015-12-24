package abstractfactory;

import java.lang.Integer;
import java.lang.String;
import java.lang.System;

//ConcreteProduct
public class Heroin extends LeadingActor{
    public Heroin(String name){
        super(name);
    }

    public void say(){
        System.out.println(name + "がヒロインです");
    }
}