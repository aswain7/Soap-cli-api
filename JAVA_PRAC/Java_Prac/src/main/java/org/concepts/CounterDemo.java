package org.concepts;

public class CounterDemo {
    static int count=0;
    CounterDemo(){
        count++;
        System.out.println(count);
    }
    static void display(){
        System.out.println(" I am a static method");
    }

    static void disc(){
        System.out.println("I am a static disc method");
        display();
        new CounterDemo().carom();
        CounterDemo cd4 = new CounterDemo();
        cd4.cartoon();
    }
    void carom(){
        System.out.println("I am a carom");
        disc();

        new CounterDemo().cartoon();
    }
    void cartoon(){
        System.out.println("Cartoon");

    }



    public static void main(String[] args) {
        CounterDemo cd = new CounterDemo();
        CounterDemo cd1 = new CounterDemo();
        CounterDemo cd2 = new CounterDemo();
        CounterDemo cd3 = new CounterDemo();

    }
}
