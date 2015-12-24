package prototype;

public class ConcreteMinionPrototype extends MinionPrototype{
    private int id;
    public ConcreteMinionPrototype(int id){
        this.id = id;
    }

    public MinionPrototype createClone(){
        ConcreteMinionPrototype concreteMinionPrototype = null;
        try{
            concreteMinionPrototype = (ConcreteMinionPrototype)this.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return concreteMinionPrototype;
    }
    public int getId(){
        return id;
    }
}