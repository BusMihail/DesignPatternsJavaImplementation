package creational_patterns.builder;

public class Product {
    private String name;
    private Integer value;
    private Boolean status;

    public Product(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Boolean getStatus() {
        return status;
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
