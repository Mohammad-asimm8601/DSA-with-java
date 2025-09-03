// Given an array of marks of student,if the mark of any student is less than 35 print its roll number .[roll number here refers to the index of the array.]
package arrays.questions;

public class Student {
    public static void main(String[] args) {
        int[] marks = {65,33, 26, 76, 54, 65, 78, 11, 45, 67, 13, 90, 91, 45};

        int n = marks.length;

        for (int i = 0; i < n; i++) {
            if(marks[i] < 35){
                System.out.print(i+" ");
            }
        }
    }
}
