package string.question;

public class PassingStringToFunction {
    public static void main(String[] args) {
        String s = "Asim";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
    public static void  change(String a){
        a= "misa";
    }
}
