package map_interface.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Shushant");
        map.put(2,"Ram");
        map.put(3,"Shyam");


        String name = map.get(2); //gives null if not present
        map.containsKey(4);
        map.containsValue("Shyam");

        //looping
        for(Integer key : map.keySet()) {
           // System.out.println(map.get(key));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : entries) {
            //System.out.println(entry.getKey()+": "+entry.getValue());
        }

//        map.remove(3);
//        map.remove(2,"Ram");
        //map.clear();

        System.out.println(map);


    }
}
