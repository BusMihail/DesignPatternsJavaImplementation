import structural_patterns.bridge.*;

void main(){
    Implementation implementation = new ConcreteImplementationOne();
    Abstraction abstraction = new Abstraction(implementation);
    abstraction.feature1();
    abstraction.feature2();

    Implementation implementation2 = new ConcreteImplementationTwo();
    Abstraction refinedAbstraction = new RefinedAbstraction(implementation2);
    refinedAbstraction.feature1();
    refinedAbstraction.feature2();
}
