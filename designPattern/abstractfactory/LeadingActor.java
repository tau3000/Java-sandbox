package abstractfactory;

import java.lang.String;

// AbstractProduct
public abstract class LeadingActor{
    protected String name;

    public LeadingActor(String name){
        this.name = name;
    }

    public abstract void say();
}