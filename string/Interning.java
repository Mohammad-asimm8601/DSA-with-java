package string;

public class Interning {
    public static void main(String[] args) {
        String s = "Raghav";
        String q = "Raghav";
        @SuppressWarnings({"unused", "RedundantStringConstructorCall"})
        String t = new String("Raghav");
        System.out.println(s);
        System.out.println(q);
        
    }
}
