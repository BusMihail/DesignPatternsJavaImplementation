import creational_patterns.prototype.ConcretePrototype;
import creational_patterns.prototype.Prototype;
import creational_patterns.prototype.PrototypeRegistry;
import creational_patterns.prototype.SubclassPrototype;

void main() {
    PrototypeRegistry registry = new PrototypeRegistry();
    registry.addPrototype(new ConcretePrototype("FirstPrototype"));
    registry.addPrototype(new ConcretePrototype("SecondPrototype"));
    registry.addPrototype(new SubclassPrototype("ThirdPrototype", "FirstSubclassPrototype"));
    registry.addPrototype(new SubclassPrototype("FourthPrototype", "SecondSubclassPrototype"));
    System.out.println("List of prototypes in the registry:");
    registry.getPrototypes().stream().map(Prototype::getFields).forEach(System.out::println);

    List<Prototype> clonedPrototypes = registry.getPrototypes().stream().map(Prototype::clone).toList();
    System.out.println("\nList of cloned prototypes:");
    clonedPrototypes.stream().map(Prototype::getFields).forEach(System.out::println);

    System.out.println("\nComparing clones:");
    clonedPrototypes.stream()
            .map( prototype -> {
                Prototype original = registry.getPrototypeByField(prototype.getFields());
                System.out.println(prototype.getFields() + " is clone of " + original.getFields() + "?");
                return prototype!=original;
            }).forEach(System.out::println);
}