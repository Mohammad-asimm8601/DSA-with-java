package Hashmaps;

import java.util.HashMap;

public class MapIterate {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        for (String key: map.keySet()) {
            int val = map.get(key);
            System.out.println(key+" "+val);
        }
        for(int val : map.values()){
            System.out.println(val);
        }
        System.out.println();
        for (Object pair : map.entrySet()) {
            System.out.println(pair);
        }
    }
}
