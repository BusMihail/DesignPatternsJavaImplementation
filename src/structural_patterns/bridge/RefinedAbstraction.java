package structural_patterns.bridge;

public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementation implementation) {
        super(implementation);
    }

    @Override
    public void feature1() {
        this.implementation.method1();
        this.implementation.method2();
    }
}
