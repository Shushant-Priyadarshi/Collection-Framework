package sorting_objects.comparator;


import java.util.ArrayList;
import java.util.Comparator;

class Student{
    int rollNo;
    String name;
    int marks;

    public Student(int rollNo, String name,int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return this.rollNo + ":" + this.name + ":" + this.marks;
    }
}

class RollNumberComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollNo - o2.rollNo;
    }
}

class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.marks - o2.marks;
    }
}


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(43,"Prisha",90));
        students.add(new Student(12,"shushant",70));
        students.add(new Student(2,"Rajneet",85));

        System.out.println("Before Sorting=> "+students);

        //students.sort(new RollNumberComparator());
        students.sort(new MarksComparator());
        System.out.println("After Sorting=> "+students);


    }
}
