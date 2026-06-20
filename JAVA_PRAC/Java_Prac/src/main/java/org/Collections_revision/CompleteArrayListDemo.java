package org.Collections_revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListRev {
    public static void main(String[] args) {

        // =========================
        // 1. add()
        // =========================
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("After add(): " + fruits);

        // =========================
        // 2. get()
        // =========================
        String value = fruits.get(1);

        System.out.println("get(1): " + value);

        // =========================
        // 3. set()
        // =========================
        fruits.set(1, "Orange");

        System.out.println("After set(): " + fruits);

        // =========================
        // 4. remove()
        // =========================

        // remove by index
        fruits.remove(0);

        System.out.println("After remove(index): " + fruits);

        // remove by object
        fruits.remove("Mango");

        System.out.println("After remove(object): " + fruits);

        // =========================
        // 5. size()
        // =========================
        System.out.println("Size: " + fruits.size());

        // =========================
        // 6. isEmpty()
        // =========================
        System.out.println("Is Empty?: " + fruits.isEmpty());

        // =========================
        // 7. addAll()
        // =========================
        ArrayList<String> extraFruits = new ArrayList<>();

        extraFruits.add("Grapes");
        extraFruits.add("Pineapple");

        fruits.addAll(extraFruits);

        System.out.println("After addAll(): " + fruits);

        // =========================
        // 8. removeAll()
        // =========================
        fruits.removeAll(extraFruits);

        System.out.println("After removeAll(): " + fruits);

        // =========================
        // 9. sort()
        // =========================
        fruits.add("Kiwi");
        fruits.add("Apple");
        fruits.add("Cherry");

        Collections.sort(fruits);

        System.out.println("After sort(): " + fruits);

        // =========================
        // 10. iterator()
        // =========================
        Iterator<String> iterator = fruits.iterator();

        System.out.println("Using Iterator:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // =========================
        // 11. listIterator()
        // =========================
        ListIterator<String> listIterator = fruits.listIterator();

        System.out.println("Using ListIterator (Forward):");

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Using ListIterator (Backward):");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // =========================
        // 12. for loop
        // =========================
        System.out.println("Using For Loop:");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // =========================
        // 13. foreach loop
        // =========================
        System.out.println("Using Foreach Loop:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // =========================
        // 14. contains()
        // =========================
        System.out.println("Contains Apple?: " + fruits.contains("Apple"));

        // =========================
        // 15. clear()
        // =========================
        fruits.clear();

        System.out.println("After clear(): " + fruits);

        // =========================
        // 16. isEmpty() after clear
        // =========================
        System.out.println("Is Empty After clear?: " + fruits.isEmpty());
    }


}
