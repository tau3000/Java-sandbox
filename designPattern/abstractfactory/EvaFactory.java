package abstractfactory;

import java.lang.String;

//Factory
public class EvaFactory extends AnimeFactory{
    public LeadingActor getLeadingActor(){
        return new Hero("碇シンジ");
    }

    public SupportingActor getSupportingActor(){
        return new ImportantCharacter("綾波レイ");
    }
}