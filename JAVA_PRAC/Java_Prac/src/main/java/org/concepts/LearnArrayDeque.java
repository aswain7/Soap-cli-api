package org.concepts;

import java.util.ArrayDeque;
import java.util.Queue;

public class LearnArrayDeque {
    public static void main(String[] args) {
        Queue<Integer> q1=new ArrayDeque();
        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(5);
        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1.poll());
        System.out.println(q1);
        System.out.println(q1.peek());
    }
}
