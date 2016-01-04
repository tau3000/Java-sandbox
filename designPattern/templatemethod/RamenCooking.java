package templatemethod;

public abstract class RamenCooking{
    public abstract void boil();
    public abstract void mix();
    public abstract void putTopping();
    public void createWoodCutPrint(){
        boil();
        mix();
        putTopping();
        System.out.println("出来上がり");
    }
}