package list_interface.arrayList;

import java.util.ArrayList;
import java.util.List;

class Student {
   private String name;
     private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa =  gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

public class Three{
     public static void main(String[] args) {
            Student s1  = new Student("Shushant",9.4);
            Student s2  = new Student("Prisha",10);
            Student s3  = new Student("Rajneet",8);

            List<Student> list = new ArrayList<>();
            list.add(s1);
            list.add(s2);
            list.add(s3);

            list.sort((a,b)-> {
                if(b.getGpa()-a.getGpa()>0){
                    return 1;
                }else if(b.getGpa()-a.getGpa()<0){
                    return -1;
                }else{
                    return 0;
                }
            });

            for(Student student : list){
                System.out.println("NAME: "+ student.getName()+" => GPA: "+ student.getGpa());
            }
     }
}
