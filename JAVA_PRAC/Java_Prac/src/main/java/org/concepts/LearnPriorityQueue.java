package org.concepts;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer>q1=new PriorityQueue<>();
        q1.offer(90);
        q1.offer(30);
        q1.offer(20);
        q1.offer(40);
        q1.offer(10);
        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1);
        System.out.println(q1.peek());
    }
}
