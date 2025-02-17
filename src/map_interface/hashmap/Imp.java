package map_interface.hashmap;

import java.util.HashMap;
import java.util.Objects;

class Student{
    Integer id;
    String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;

    }

    //before defining this s1 and s3 have different hashcodes even having same keys and
    // hence treated different objects

    //This method generates a hash code for the object using id and name.
    //Objects.hash(id, name) combines multiple fields to create a unique hash code.
    //If two objects have the same id and name, they will have the same hash code.
    //If they have the same hash code, Java checks equals() to avoid duplicates.
    @Override
    public int hashCode() {
        return Objects.hash(id, name); // Generate hash based on fields
    }


//    Step 1: If this and obj refer to the same memory object, return true.
//    Step 2: If obj is null or of a different class, return false.
//    Step 3: Cast obj to Student and compare id and name.
//    If both fields are equal, return true, otherwise return false.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id && name.equals(student.name);
    }

}

public class Imp {
    public static void main(String[] args) {
        HashMap<Student,Integer> marks = new HashMap<>();
        Student s1 = new Student(1, "Shushant");
        Student s2 = new Student(2, "Prisha");
        Student s3 = new Student(1, "Shushant");

        marks.put(s1,89);
        marks.put(s2,99);
        marks.put(s3,54);

        System.out.println(marks.get(s1));
        System.out.println(marks.get(s2));
        System.out.println(marks.get(s3));


    }
}
