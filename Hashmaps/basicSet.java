package Hashmaps;
import java.util.HashSet;
public class basicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Insert : TC O(1)
        set.add(20);
        set.add(100);
        set.add(-8);
        set.add(40);
        set.add(101);
        System.out.println(set);

        // Search - true or false : TC O(1)
        System.out.println(set.contains(100));

        // Size
        System.out.println(set.size());

        // Remove  : TC O(1)
        set.remove(20);
        System.out.println(set);

        Object[] arr = set.toArray();
        for(Object ele : arr){
            System.out.print(ele+" ");
        }

    }
}
