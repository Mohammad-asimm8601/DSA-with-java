package string;

public class StringBuilderFunctions {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Asim");
        StringBuilder tb = new StringBuilder("Jsim");
        System.out.println(sb.compareTo(tb));
        System.out.println(sb.append('m'));
        System.out.println(sb.reverse());
        System.out.println(sb.indexOf("s"));
    }
}
