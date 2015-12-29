package flyweight;

public class FlyHuman{
    private String humanName;

    public FlyHuman(String humanName){
        this.humanName = humanName;
    }
    /*public void setHumanName(string humanName){
        this.humanName = humanName;
    };

    public string getHumanName(){
        return humanName;
    }*/

    public void say(){
        System.out.println(humanName + " can fly!");
    }
}