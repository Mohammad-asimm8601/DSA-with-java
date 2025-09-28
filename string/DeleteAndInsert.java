package string;

public class DeleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        sb.delete(2, 4);
        System.out.println(sb);
        sb.insert(2, true);
        System.out.println(sb);
    }
}
