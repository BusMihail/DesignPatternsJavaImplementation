package creational_patterns.abstract_factory.domain.alpha;

public abstract class Alpha {
    private final String type;

    public Alpha(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void printAlphaType(){
        System.out.println("Alpha type is: " + this.getType());
    }
}
