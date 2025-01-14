package list_interface.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        //if int = -1 => then  o1 > o2 => o1 pehle aaega
        //if int = 0 => then o1 = o2 => same preference
        //if int = +1 => then o1 < o2 => o2 pehle aaega
                     // suppose [ 5,3] => o1-o2 => 5-3 => 2 => 3 pehle aaega
                    // [3,5] => o1-o2 => 3-5 => -2 => 3 pehle aaega
        return o2-o1;
    }
}


public class Two {
    public static void main(String[] args) {
        // Comparator
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(22);

        list.sort(new MyComparator()); //public void sort(Comparator<? super E> c)
        //System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Damn");
        list1.add("Damn1");
        list1.add("Damn12");
        list1.add("Damn1234");
        System.out.println(list1);

        list1.sort((a,b)->b.length()-a.length());
        System.out.println(list1);


    }
}
