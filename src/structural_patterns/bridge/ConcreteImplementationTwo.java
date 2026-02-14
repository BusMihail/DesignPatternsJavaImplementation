package structural_patterns.bridge;

public class ConcreteImplementationTwo implements Implementation {
    @Override
    public void method1() {
        IO.println("11");
    }

    @Override
    public void method2() {
        IO.println("22");
    }

    @Override
    public void method3() {
        IO.println("33");
    }
}
