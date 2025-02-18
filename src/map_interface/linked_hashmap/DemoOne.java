package map_interface.linked_hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DemoOne {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3,"Rajneet");
        linkedHashMap.put(1,"Shushant");
        linkedHashMap.put(2,"Prisha");


        for(Map.Entry<Integer, String> entry:linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
