package string_thing;

public class StringExample {
    public static void main(String[] args) {

        //It doesn't matter how you create it, its going to be immutable.
        //because its final
        String s1 = "Hello";
        String s2 = "World";

        String v1 = new String("Hello");
        String v2 = new String("World");

        s1.concat(s2); //this will not work
        //System.out.println(s1); //this will not work

        String concat = s1.concat(s2);
        //System.out.println(concat);

        String result="";
        for(int i =0 ; i < 10 ; i++){
            result += "Hello_";
        }
        System.out.println(result);


    }
}
