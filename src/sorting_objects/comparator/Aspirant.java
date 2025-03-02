package sorting_objects.comparator;

import java.util.ArrayList;
import java.util.Comparator;

class AspirantSorting implements Comparator<Aspirant> {

//    @Override
//    public int compare(Aspirant o1, Aspirant o2) {
//        return o1.marks - o2.marks; //asccending order
//    }

    @Override
    public int compare(Aspirant o1, Aspirant o2) {
        return o1.name.compareTo(o2.name); //alphabetical order
    }
}
public class Aspirant {
    String name;
    int marks;

    public Aspirant(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return this.marks+": "+this.name;
    }

    public static void main(String[] args) {
        ArrayList<Aspirant> list = new ArrayList<>();
        list.add(new Aspirant("Shushant",89));
        list.add(new Aspirant("Prisha",99));
        list.add(new Aspirant("Rajneet",95));
        list.add(new Aspirant("Manjistha",79));
        System.out.println("Before: "+ list);
        list.sort(new AspirantSorting());
        System.out.println("After: "+list );
    }
}
