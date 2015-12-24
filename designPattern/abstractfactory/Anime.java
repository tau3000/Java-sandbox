package abstractfactory;

import java.lang.String;
import java.lang.System;

//target class
public class Anime{
    private String title;
    private LeadingActor leadingActor;
    private SupportingActor supportingActor;
    public Anime(String title){
        this.title = title;
    }
    public void addLeadingActor(LeadingActor leadingActor){
        this.leadingActor = leadingActor;
    }
    public void addSupportingActor(SupportingActor supportingActor){
        this.supportingActor = supportingActor;
    }
    public void introduce(){
        System.out.println(title + "の紹介");
        leadingActor.say();
        supportingActor.say();
    }
}