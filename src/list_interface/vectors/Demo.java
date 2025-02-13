package list_interface.vectors;

import java.util.Vector;

public class Demo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(100);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        System.out.println(vector.capacity());
        System.out.println(vector.size());

        //mostly same as arraylist but with thread safety
        //due to locking and unlocking of threads

    }


}
