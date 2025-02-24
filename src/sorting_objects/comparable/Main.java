package sorting_objects.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Stundet implements Comparable<Stundet> {
    int marks;
    String name;

    public Stundet(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.marks + ": " + this.name;
    }


    @Override
    public int compareTo(Stundet o) {
        return this.marks - o.marks;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Stundet> stundets = new ArrayList<Stundet>();
        stundets.add(new Stundet(89, "Prisha"));
        stundets.add(new Stundet(43, "Tulsi"));
        stundets.add(new Stundet(64, "Rajneet"));
        stundets.add(new Stundet(32, "Manjistha"));
        stundets.add(new Stundet(12, "Shushant"));
        stundets.add(new Stundet(78, "Shivani"));

        System.out.println("Before sorting: " + stundets);

        Collections.sort(stundets);
        System.out.println("After sorting: " + stundets);
    }
}
