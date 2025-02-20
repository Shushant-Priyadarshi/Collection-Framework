package map_interface.identity_hashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        IdentityHashMap is a specialized implementation of the Map interface
//        in Java that compares keys using reference equality (==) instead of object equality (equals()).

        String key1 = new String("key");
        String key2 = new String("key");

        //=> Hashmap use hashcode and then equals method , and this is why is will replace key = 1 to key = 2
        //=> as the hashcode depends upon the content of the string key1 = key (key is same in both string).
        //Map<String, Integer> map = new HashMap<>();

        //=> But Identity hashmap checks the memory location instead of checking the content
        Map<String, Integer> map = new IdentityHashMap<>();
        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(map);

//        String one = new String("one");
//        String two = new String("one");
//
//        System.out.println(one == two);
//        System.out.println(one.equals(two));
//
//
//        String three = "three";
//        String four = "three";
//        System.out.println(three == four);
//        System.out.println(three.equals(four));



    }

}
