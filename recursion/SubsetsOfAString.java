package recursion;

import java.util.ArrayList;

public class SubsetsOfAString {
    static ArrayList<String> arr = new ArrayList<>();
    public static void subset(int i,  String s, String ans){
        if(i == s.length()) {
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        subset(i+1, s, ans); // not take
        subset(i+1, s, ans+ch); // take
        
     }
    public static void main(String[] args) {
        String s = "1234";
        arr = new ArrayList<>(); // reset
        subset(0, s, "");
        System.out.println(arr);
    }
}
