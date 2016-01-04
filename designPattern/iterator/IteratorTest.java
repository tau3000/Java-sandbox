package iterator;

public class IteratorTest{
    public void test(){
        System.out.println("Iterator Test");

        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.addRamen(new Ramen("豚骨"));
        concreteAggregate.addRamen(new Ramen("味噌"));
        concreteAggregate.addRamen(new Ramen("醤油"));
        concreteAggregate.addRamen(new Ramen("塩"));
        Iterator it = concreteAggregate.iterator();
        while (it.hasNext()) {
            Ramen ramen = (Ramen) it.next();
            System.out.println(ramen.getName());
        }

        //ConcreteIteratorのindexが加算されているので、二度目は使えない
        while (it.hasNext()) {
            Ramen ramen = (Ramen) it.next();
            System.out.println(ramen.getName());
        }
    }
}