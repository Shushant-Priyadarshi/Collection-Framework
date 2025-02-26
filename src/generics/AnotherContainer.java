package generics;

public class AnotherContainer<T> implements GenericInterface<T>{


    private T value;

    @Override
    public void add(T value) {
        this.value = value;
    }

    @Override
    public T get() {
        return this.value;
    }
}
