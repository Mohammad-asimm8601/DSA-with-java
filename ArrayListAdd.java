import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list+" "+list.size());
        list.add(0, 23);
        System.out.println(list+" "+list.size());
        list.add(1, 63);
        System.out.println(list+" "+list.size());
        list.add(2, 44);
        System.out.println(list+" "+list.size());
        list.add(3, 90);
        System.out.println(list+" "+list.size());
        list.add(4, -1);
        System.out.println(list+" "+list.size());
        list.remove(3);
        System.out.println(list+" "+list.size());


    }
}
    