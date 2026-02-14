package structural_patterns.bridge;

public class Abstraction {
    protected final Implementation implementation;

    public Abstraction(Implementation implementation){
        this.implementation = implementation;
    }

    public void feature1(){
        implementation.method1();
    }

    public void feature2(){
        implementation.method2();
        implementation.method3();
    }
}
