// Input a string and toggle all the characters of it.(Replace small case with capital case & vice  versa)
package string.question;

public class ToggalTheCharacter {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("AasIm");
        int n  = sb.length();
        for (int i = 0; i < n; i++) {
            int ch = sb.charAt(i);
            if(ch >= 97 && ch <= 122){
                sb.setCharAt(i, (char)(ch-32));
            }
            else if(ch >= 65 && ch <= 90) {
                sb.setCharAt(i, (char)(ch+32));
            }
        }
        System.out.println(sb);
    }
}
