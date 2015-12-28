package bridge;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }
    public void refinedMethod() {
        System.out.println("追加機能");
    }
}