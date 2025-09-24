package string;

public class PlusOperator {
    public static void main(String[] args) {
        String s = "abc";
        String t = "pqr";
        s = 10 + s + "z";
        System.out.println(s+t);

        System.out.println("abc" +10+20);
        System.out.println(10+20+"abc");
    }
}
