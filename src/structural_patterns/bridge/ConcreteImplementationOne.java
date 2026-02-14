package structural_patterns.bridge;

public class ConcreteImplementationOne implements Implementation {
    @Override
    public void method1() {
        IO.println("1");
    }

    @Override
    public void method2() {
        IO.println("2");
    }

    @Override
    public void method3() {
        IO.println("3");
    }
}
