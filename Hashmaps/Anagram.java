package Hashmaps;

import java.util.HashMap;
import java.util.Objects;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map1.containsKey(ch)){
                int freq = map1.get(ch);
                map1.put(ch, freq+1);
            }
            else map1.put(ch, 1);
        }
        System.out.println(map1);

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(map2.containsKey(ch)){
                int freq = map2.get(ch);
                map2.put(ch, freq+1);
            }
            else map2.put(ch, 1);
        }
        System.out.println(map2);
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if(!Objects.equals(map1.get(key), map2.get(key))){
                flag = false;
            }
            
        }
        System.out.println(flag);
    }
}
