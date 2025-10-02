// Compress a given string.
package string.question;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaaabbcddefff";
        int n = s.length();
        int i=0;
        while(i<n){
            int j = i;
            while( j<n && s.charAt(i) == s.charAt(j)){
                j++;
            }
            System.out.print(s.charAt(i)+""+(j-i));
            i = j;
        } 
    }
}
