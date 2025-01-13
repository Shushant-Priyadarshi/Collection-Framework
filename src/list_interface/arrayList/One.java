package list_interface.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class One {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(40);
        list.add(50);

//+++++++++++++++ ITERATION ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        for(Integer x : list){
           // System.out.println(x);
        }

//+++++++++++++++ Important Methods ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        //System.out.println(list.contains((60)));
        //System.out.println(list.get(2)); //get(index)
        //System.out.println(list.size());
        // System.out.println(list);
        //list.remove(2); //remove(index)
        //list.add(0,10); //add(index,element) => insert at the place
        //list.set(1, 100); => replace at the place
        //list.sort(null);

//+++++++++++++++ Creation ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        //Resizable and replaceable
        ArrayList<Integer> list2 = new ArrayList<>();

        //cannot resize but replace the elements
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);

        //nor resize and replace
        List<Integer> integers = List.of(2, 3, 4, 5, 6);


    }
}
