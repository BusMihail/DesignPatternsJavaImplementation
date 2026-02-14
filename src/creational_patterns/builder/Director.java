package creational_patterns.builder;

import java.util.Optional;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public void buildManual(Boolean b, String string, Integer integer) {
        builder.reset();
        Optional<Boolean> optionalBoolean = Optional.ofNullable(b);
        //default to false
        builder.setBoolean(optionalBoolean.orElse(false));

        Optional<String> optionalString = Optional.ofNullable(string);
        //default to empty string
        builder.setString(optionalString.orElse(""));

        Optional<Integer> optionalInteger = Optional.ofNullable(integer);
        //default to -1
        builder.setInteger(optionalInteger.orElse(-1));
    }

    public void buildFalseEmptyZero() {
        builder.reset();
        builder.setBoolean(false);
        builder.setString("");
        builder.setInteger(0);
    }

    public void buildTrueTextOne() {
        builder.reset();
        builder.setBoolean(true);
        builder.setString("text");
        builder.setInteger(1);
    }
}
