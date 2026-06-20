package org.LearnCollections;

import java.util.HashMap;
import java.util.Map;

public class Program9 {
    public static void main(String[] args) {
        int arr[] = {11,7,2,15};
        int target = 22;

        Map<Integer,Integer> m1=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diff = target - arr[i];
            if(m1.containsKey(diff)){
                System.out.println(diff+" "+arr[i]);
            }
            m1.put(arr[i],i);
        }


    }
}
