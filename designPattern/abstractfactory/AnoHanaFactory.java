package abstractfactory;

import java.lang.String;

//Factory
public class AnoHanaFactory extends AnimeFactory{
    public LeadingActor getLeadingActor(){
        return new Heroin("めんま");
    }

    public SupportingActor getSupportingActor(){
        return new NormalCharacter("じんたん");
    }
}