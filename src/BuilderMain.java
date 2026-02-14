import creational_patterns.builder.Builder;
import creational_patterns.builder.ConcreteBuilder;
import creational_patterns.builder.ConcreteBuilderWithModifications;
import creational_patterns.builder.Director;

void main() {
    Builder concreteBuilder = new ConcreteBuilder();
    Builder concreteBuilderWithModifications = new ConcreteBuilderWithModifications();
    Director director = new Director(concreteBuilder);

    System.out.println("Using ConcreteBuilder...");
    System.out.print("Building False, Empty, Zero: ");
    director.buildFalseEmptyZero();
    System.out.println(concreteBuilder.getResult());

    System.out.print("Building True, Text, One: ");
    director.buildTrueTextOne();
    System.out.println(concreteBuilder.getResult());

    System.out.print("Building Manual null(defaults to false), Hello, null(defaults to -1): ");
    director.buildManual(null, "Hello", null );
    System.out.println(concreteBuilder.getResult());


    System.out.println("\nUsing ConcreteBuilderWithModifications: !boolean, string with \" - modified\", integer + 100...");
    director.changeBuilder(concreteBuilderWithModifications);
    System.out.print("Building False, Empty, Zero: ");
    director.buildFalseEmptyZero();
    System.out.println(concreteBuilderWithModifications.getResult());

    System.out.print("Building True, Text, One: ");
    director.buildTrueTextOne();
    System.out.println(concreteBuilderWithModifications.getResult());

    System.out.print("Building Manual null(defaults to false), Hello, null(defaults to -1): ");
    director.buildManual(null, "Hello", null );
    System.out.println(concreteBuilderWithModifications.getResult());

}