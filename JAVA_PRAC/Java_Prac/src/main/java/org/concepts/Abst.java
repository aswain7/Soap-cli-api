package org.concepts;

abstract public class Abst {
    static int z=10;

    abstract void start();
    void run(){
        System.out.println(" I am running");

    }
    static void walk(){
        System.out.println("I am walking");

    }


    public static void main(String[] args) {
        car c = new car();
        c.start();
        bike b=new bike();
        b.start();
        Abst a= new car();
        a.start();
        a.run();
        walk();
        System.out.println(z);




    }
}
class car extends Abst{
    void start(){
        System.out.println("Starts with key");
    }
}

class bike extends Abst{
    void start(){
        System.out.println("Starts with kick");
    }
}
