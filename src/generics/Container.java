package generics;

public class Container implements GenericInterface<String>{

    private String item;

    @Override
    public void add(String value) {
        item = value;
    }

    @Override
    public String get() {
        return item;
    }
}
