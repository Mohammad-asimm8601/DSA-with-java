// Finding all permutations of an string given all elements of the string are unique.
package recursion;

public class Permutation {
    public static void permut(String ans, String s){
        if(s.length() == 0){
            System.out.print(ans+" ");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i+1);
            permut(ans+ch, left+right);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        permut( "", s);
    }
}
