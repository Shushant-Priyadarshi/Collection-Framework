package generics;

public class BoundedGenerics<T extends Number>{ //Adding Conditions

    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public static void main(String[] args) {
        //BoundedGenerics<String> obj =  new BoundedGenerics<>(); //Error
        BoundedGenerics<Integer> obj2 =  new BoundedGenerics<>();
    }
}
