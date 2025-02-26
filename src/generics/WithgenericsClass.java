package generics;

public class WithgenericsClass<T> {

    private T value;

   public T getValue(){
       return value;
   }


   public WithgenericsClass(T value){
       this.value = value;
   }

   public WithgenericsClass(){}

   public void setValue(T value){
       this.value = value;
   }

    public static void main(String[] args) {
        WithgenericsClass<String> myStr = new WithgenericsClass<>();
        myStr.setValue("Shushant");

        WithgenericsClass<Integer> myInt  = new WithgenericsClass<>();
        myInt.setValue(123);

    }


}
