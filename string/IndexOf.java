package string;

public class IndexOf {
    public static void main(String[] args) {
        String str = "Mohammad Asim";
        System.out.println(str.indexOf('s'));
        System.out.println(str.indexOf('z'));
        System.out.println(str.lastIndexOf('a'));

        String a = "abcggg";
        String b = "Abc";
        System.out.println(a.compareTo(b));

        String c = "You are my son";
        System.out.println( c.contains("on"));
        System.out.println(c.startsWith("Yo"));
        System.out.println(c.endsWith("on"));
    }
}
