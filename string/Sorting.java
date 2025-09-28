package string;
import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        String s = "Asim";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        // System.out.println();
        // StringBuilder sb = new StringBuilder("Asim");
        // char[] arr = sb.toString().toCharArray();
        // Arrays.sort(arr);
        // System.out.println(arr);
    }
}
