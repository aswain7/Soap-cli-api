package org.LearnCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program16 {
    public static void main(String[] args) {
        //sort hashmap by value
        HashMap<String,Integer> map = new HashMap<>();

        map.put("A",3);
        map.put("B",1);
        map.put("C",2);

        HashMap<String,Integer> newMAP=new HashMap<>();
        List<Map.Entry<String,Integer>> l1=new ArrayList<>(map.entrySet());
        System.out.println(l1);
        l1.sort(Map.Entry.comparingByValue());
        System.out.println(l1);

    }
}
