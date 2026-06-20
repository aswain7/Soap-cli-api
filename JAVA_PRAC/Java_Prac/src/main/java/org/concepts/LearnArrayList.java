package org.concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
//        ArrayList al=new ArrayList();
//        al.add(10);
//        al.add(20);
//        al.add("Ram");
//        System.out.println(al);
        List<Integer> al=new ArrayList<>();
        //normal addition of index
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(20);
        //getting the size of the collection
        System.out.println(al.size());
        al.add(4,50);
        //getting the value with the help of index number
        System.out.println(al.get(3));
        //updating the value in a set with some specific index
        al.set(3,40);
        System.out.println("The elements present in al is :- "+al);

        List<Integer> al2=new LinkedList<>();
        al2.add(60);
        al2.add(70);
        al2.add(80);
        al2.add(90);
        al2.add(100);
        al2.remove(3);
        System.out.println("The elements present in al2 is :- "+al2);
        //if i want to add all the elements of al2 in al1 or vice versa then we need to use addll()
        al.addAll(al2);
        System.out.println("The updated value of al is :- "+al);
        //vice versa case
        al2.addAll(al);
        System.out.println("The updated value of al2 is :- "+al2);
        //how to check if we have a certain value in a list or not
        boolean a= al2.contains(110);
        System.out.println(a);
        //if we want to get each and every value of al2 then
//        There are 3 ways
//            forloop,foreach and iterator
        for(int i=0;i<al2.size();i++){
            System.out.println(al2.get(i));
        }
        System.out.println("------------");
        for(Integer b:al2){
            System.out.println(b);
        }
        System.out.println("------------");
        Iterator<Integer> i1= al2.iterator();
        while(i1.hasNext()) {
            System.out.println(i1.next());
        }

    }
}
