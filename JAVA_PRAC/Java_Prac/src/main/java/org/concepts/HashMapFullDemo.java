package org.concepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapFullDemo {
    public static void main(String[] args) {

        // 1️⃣ Creating HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // 2️⃣ put()
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Mango", 15);
        map.put("Grapes", 25);

        System.out.println("Initial Map: " + map);

        // 3️⃣ get()
        System.out.println("Value of Apple: " + map.get("Apple"));

        // 4️⃣ containsKey()
        System.out.println("Contains key Mango? " + map.containsKey("Mango"));

        // 5️⃣ containsValue()
        System.out.println("Contains value 20? " + map.containsValue(20));

        // 6️⃣ getOrDefault()
        System.out.println("Value of Orange (default 0): " +
                map.getOrDefault("Orange", 0));

        // 7️⃣ putIfAbsent()
        map.putIfAbsent("Apple", 100); // won't replace
        map.putIfAbsent("Orange", 30); // will add
        System.out.println("After putIfAbsent: " + map);

        // 8️⃣ remove()
        map.remove("Grapes");
        System.out.println("After removing Grapes: " + map);

        // 9️⃣ keySet()
        System.out.println("\nIterating using keySet():");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // 🔟 values()
        System.out.println("\nAll Values:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // 1️⃣1️⃣ entrySet() (Best way)
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
