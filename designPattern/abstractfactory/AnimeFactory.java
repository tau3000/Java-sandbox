package abstractfactory;

import java.lang.String;

//Factory
public abstract class AnimeFactory{
    public abstract LeadingActor getLeadingActor();
    public abstract SupportingActor getSupportingActor();
}