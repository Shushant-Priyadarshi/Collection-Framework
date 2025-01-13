package list_interface.arrayList;

import java.util.ArrayList;

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



    }
}
