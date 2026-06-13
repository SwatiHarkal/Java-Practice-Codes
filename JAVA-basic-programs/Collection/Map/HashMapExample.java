package Collection.Map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("Empty Map: " + map.isEmpty());

        //Adding entries
        map.put("ABC",1);
        System.out.println("Hashcode for key ABC: " + map.hashCode());
        map.put("XYZ",2);
        map.put("D",3);
        System.out.println("Size of Map: " + map.size());
        System.out.println("Empty Map: " + map.isEmpty());
        System.out.println("Entries: " +map);
        System.out.println("using get key: "+map.get("ABC"));
        System.out.println("Using contains key: " +map.containsKey("D"));
        map.replace("XYZ",2,5);

        Object removeEntry = map.remove("XYZ", 5);
        System.out.println("Removed entry: " + removeEntry);
        System.out.println("Entry Set: " +map.entrySet());

        //adding null key-value
        map.put(null, null); //it will store at index 0
        map.put(null, 1);
        map.put(null, 2); //whenever will get same key and different values it will replace value with new/current one
        //map.clear(); //table array will get empty it removes all elements
        System.out.println("Entries after Adding null key-value : " +map);
    }
}
