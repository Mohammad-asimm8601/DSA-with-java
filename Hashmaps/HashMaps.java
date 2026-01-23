package Hashmaps;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        System.out.println(map);
        System.out.println(map.containsKey("d"));
        System.out.println(map.containsValue(44));
        System.out.println(map.get("c"));
        System.out.println("size : "+map.size());
        System.out.println(map.remove("e"));
        System.out.println(map);
        
    }
}
