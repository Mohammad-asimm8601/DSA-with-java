// Input a string and update all the even positions in the string to character 'a'. Consider 0-based indexing.
package string.question;

public class UpdateEvenPosition {
    public static void main(String[] args) {
        String s  = "aism";
        int n = s.length();
        String str = "";
        for (int i = 0; i < n; i++) {
            if(i%2 == 0)str += 'a';
            else str += s.charAt(i);
        }
        s = str;
        System.out.println(s);
    }
}
