package string;

import java.util.Scanner;

public class CountConsonant {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine().toLowerCase();
            int count = 0;

            // Method - 1

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                // if(ch != 'a' && ch != 'e' && ch != 'i' && ch !='o'&& ch != 'u'){
                //     count++;
                // }
                
                // Method -2;
                if(Character.isLetter(ch) && "aeiou".indexOf(ch) == -1){
                    count++;
                }
            }



            System.out.println(count);
        }
    }
}
