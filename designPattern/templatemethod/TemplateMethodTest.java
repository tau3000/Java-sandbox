package templatemethod;

public class TemplateMethodTest{
    public void test(){
        System.out.println("Template Method Test");

        PorkRamenCooking porkRamenCooking = new PorkRamenCooking();
        porkRamenCooking.createWoodCutPrint();
    }
}