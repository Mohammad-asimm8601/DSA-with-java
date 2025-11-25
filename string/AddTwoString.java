package string;

public class AddTwoString {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";

        int i = num1.length()-1;
        int j = num2.length()-1;

        int carry = 0;
        String result = "";
        while(i >= 0 || j>=0|| carry != 0){
            int a = 0, b = 0;
            if(i >= 0){
                a = num1.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                b = num2.charAt(j) - '0';
                j--;
            }
            int sum = a + b + carry;
            result = sum + result;
        }
         System.out.println(result);
        
    }
    
}
