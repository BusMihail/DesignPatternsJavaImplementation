package creational_patterns.abstract_factory.domain.beta;

public abstract class Beta {
    private final String type;

    public Beta(String type) {
        this.type = type;
    }

    public String getType() { return type; }
    public void printBetaType(){
        System.out.println("Beta type is: " + this.getType());
    }
}
