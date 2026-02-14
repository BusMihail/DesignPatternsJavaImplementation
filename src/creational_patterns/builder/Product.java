package creational_patterns.builder;

public class Product {
    private String name;
    private Integer value;
    private Boolean status;

    public Product(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "status=" + status +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
