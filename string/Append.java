package string;

public class Append {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Abc");
        System.out.println(s);
        s.append(36);
        System.out.println(s);
        s.append('*');
        System.out.println(s);
        s.append("xyz");
        System.out.println(s);
        char[] ch = {'a','s','i','m'};
        s.append(ch);
        System.out.println(s);
        StringBuilder t = new StringBuilder("pqr");
        s.append(t);
        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
