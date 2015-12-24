package prototype;

public class PrototypeTest{
    public void test(){
        Glue glue = new Glue();
        ConcreteMinionPrototype minion1 = new ConcreteMinionPrototype(0);
        ConcreteMinionPrototype minion2 = new ConcreteMinionPrototype(1);
        ConcreteMinionPrototype minion3 = new ConcreteMinionPrototype(2);

        glue.regist("0", minion1);
        glue.regist("1", minion2);
        glue.regist("2", minion3);

        MinionPrototype minionPrototype1 = glue.create("0");
        MinionPrototype minionPrototype2 = glue.create("1");
        MinionPrototype minionPrototype3 = glue.create("2");

        System.out.println(((ConcreteMinionPrototype)minionPrototype1).getId());//0
        System.out.println(((ConcreteMinionPrototype)minionPrototype2).getId());//1
        System.out.println(((ConcreteMinionPrototype)minionPrototype3).getId());//2
    }
}