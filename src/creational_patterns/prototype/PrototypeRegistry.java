package creational_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeRegistry {
    private final List<Prototype> prototypes;

    public PrototypeRegistry() {
        prototypes = new ArrayList<>();
    }

    public void addPrototype(Prototype prototype) {
        prototypes.add(prototype);
    }

    public List<Prototype> getPrototypes() {
        return prototypes;
    }

    public Prototype getPrototypeByField(String field) {
        return prototypes.stream().filter(prototype -> prototype.getFields().contains(field)).findFirst().orElse(null);
    }
}
