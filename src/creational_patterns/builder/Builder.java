package creational_patterns.builder;

public interface Builder {
    void reset();
    void setBoolean(Boolean b);
    void setString(String string);
    void setInteger(Integer integer);
     Product getResult();
}
