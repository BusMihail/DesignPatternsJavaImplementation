package creational_patterns.builder;

public class ConcreteBuilderWithModifications implements Builder {
    private Product product;
    @Override
    public void reset() {
        this.product = new Product();
    }

    @Override
    public void setBoolean(Boolean b) {
        product.setStatus(!b);
    }

    @Override
    public void setString(String string) {
        product.setName(string + " - modified");
    }

    @Override
    public void setInteger(Integer integer) {
        product.setValue(integer + 100);
    }


    @Override
    public Product getResult() {
        return this.product;
    }
}
