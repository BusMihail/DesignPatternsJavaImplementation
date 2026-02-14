package creational_patterns.prototype;

public class ConcretePrototype implements Prototype {
    private final String field1;

    public ConcretePrototype(String field1) {
        this.field1 = field1;
    }

    protected ConcretePrototype(ConcretePrototype concretePrototype) {
        this.field1 = concretePrototype.field1;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }

    @Override
    public String getFields() {
        return this.field1 + " ";
    }
}
