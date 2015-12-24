package abstractfactory;

import java.lang.String;

public abstract class SupportingActor{
    protected String name;

    public SupportingActor(String name){
        this.name = name;
    }

    public abstract void say();
}