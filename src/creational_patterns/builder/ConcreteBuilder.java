package creational_patterns.builder;

public class ConcreteBuilder implements Builder {
    private Product product;
    @Override
    public void reset() {
        this.product = new Product();
    }

    @Override
    public void setBoolean(Boolean b) {
        product.setStatus(b);
    }

    @Override
    public void setString(String string) {
        product.setName(string);
    }

    @Override
    public void setInteger(Integer integer) {
        product.setValue(integer);
    }


    @Override
    public Product getResult() {
        return this.product;
    }
}
