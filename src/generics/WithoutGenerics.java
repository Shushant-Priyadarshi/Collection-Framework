package generics;

import java.util.ArrayList;

public class WithoutGenerics {
    public static void main(String[] args) {
        //No time safety
        ArrayList list =  new ArrayList();
        list.add("Hello");
        list.add(128);
        list.add(43.23);

        Object str = list.get(0);
        String Num = (String) list.get(1); //Runtime Error
    }
}
