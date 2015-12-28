package bridge;

public class Abstraction {
    private Implementor impl;
    public Abstraction(Implementor impl) {
        this.impl = impl;
    }
    public void abstractionMethod() {
        impl.implMethod();
    }
}