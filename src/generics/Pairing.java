package generics;

public class Pairing<K,V> {

    private  K key;
    private  V value;

    public Pairing(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void getValues(){
        System.out.println("Key: "+this.key+", "+"Value: "+this.value);
    }

    public static void main(String[] args) {
        Pairing<Integer,String> student1 = new Pairing<>(1,"Shushant");
        Pairing<String,Double> marks = new Pairing<>("Shushant",89.54);
        student1.getValues();
        marks.getValues();
    }
}
