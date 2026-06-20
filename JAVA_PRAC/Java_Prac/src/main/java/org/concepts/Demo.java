package org.concepts;

public class Demo {
    static {
        System.out.println("Static block 1");
    }

    {
        System.out.println("Instance block 1");
    }

    static {
        System.out.println("Static block 2");
    }
    Demo() {
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance block 2");
    }



    public static void main(String[] args) {
        System.out.println("Main starts");
        Demo d1 = new Demo();
        Demo d2 = new Demo();
    }
}
