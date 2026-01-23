package Hashmaps;

import java.util.HashSet;

public class SetIterate { 
    public static void print(HashSet<Integer> set){
        for (Object elem : set) {
            System.out.print(elem+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println(set);
        print(set);
    }
}
