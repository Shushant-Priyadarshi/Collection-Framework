package sorting_objects.comparable;


import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp>{
    int id;
    String name;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return  this.id+": "+ this.name;
    }

    @Override
    public int compareTo(Emp o) {
        return this.id - o.id;
    }
}
public class Learning {
    public static void main(String[] args) {
        ArrayList<Emp> list= new ArrayList<>();
        list.add(new Emp(2,"Prisha"));
        list.add(new Emp(4,"Rajneet"));
        list.add(new Emp(1,"Manjistha"));
        list.add(new Emp(3,"Shushant"));
        System.out.println("Before Sorting: "+list);
        Collections.sort(list);
        System.out.println("After Sorting: "+list);


    }
}
