package list_interface.linkedList;

import java.util.LinkedList;

public class One {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(3);
        list.add(2);
        list.addFirst(4);
        list.addLast(0);

        //System.out.println(list);
        //System.out.println(list.get(0)); // 0 based indexing

        list.removeFirst();
        list.removeLast();
        list.remove(2);
       // System.out.println(list);


        LinkedList<Integer> list2 = new LinkedList();
        list2.add(1);
        list2.add(3);
        list2.add(2);
        list2.add(4);
        list2.addFirst(0);
        System.out.println(list2);
        list2.removeIf(x -> x % 2 == 0);

        System.out.println(list2);

    }
}
