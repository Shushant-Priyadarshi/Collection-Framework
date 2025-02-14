package list_interface.copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        // "Copy and write" means whenever a write operation is done like adding or
        // removing of elements, instead of modifying the arraylist a new copy is created and
        // the modifications are applied on it this ensures thread safety.

        //List<String> list = new ArrayList<>();
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Milk");
        list.add("Egg");
        list.add("Bread");
        System.out.println("Original list: " + list);
        for(String items : list) {
            System.out.println(items);
            if(items.equals("Egg")) {
                list.add("Butter");
                System.out.println("Added Butter...");

            }
        }
        System.out.println("Modified list: " + list);
    }
}
