package Heaps;
import java.util.Arrays;

class Student implements Comparable<Student>{
    int rno;
    double perc;
    String name;

    public Student(int rno, double perc, String name) {
        this.rno = rno;
        this.perc = perc;
        this.name = name;
    }
    @Override
    public int compareTo(Student s){
        return this.rno - s.rno;
    }
    
}

public class CustomComparator {
    private  static void print(Student[] s){
        for (Student item : s) {
            System.out.print(item.name + " ");
            System.out.print(item.rno + " ");
            System.out.println(item.perc + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student(65, 61.7,"Mohammd Asim");
        s[1] = new Student(56, 31.7,"Ahmad Asim");
        s[2] = new Student(89, 81.7,"Aashique");
        s[3] = new Student(20, 91.7,"Jainab Khatoon");
        print(s);
        Arrays.sort(s);
        print(s);
    }
}
