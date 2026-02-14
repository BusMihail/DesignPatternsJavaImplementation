package creational_patterns.prototype;

public class SubclassPrototype extends ConcretePrototype {
    public final String field2;

    public SubclassPrototype(String field1, String field2) {
        super(field1);
        this.field2 = field2;
    }

    protected SubclassPrototype(SubclassPrototype prototype) {
        super(prototype);
        this.field2 = prototype.field2;
    }

    @Override
    public Prototype clone() {
        return new SubclassPrototype(this);
    }

    @Override
    public String getFields() {
        return super.getFields() + this.field2 + " ";
    }
}
