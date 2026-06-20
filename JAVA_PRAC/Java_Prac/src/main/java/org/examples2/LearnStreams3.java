package org.examples2;

import java.util.ArrayList;
import java.util.List;

class Employeee{
    String name;
    int id;
    int salary;

    Employeee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void display(){
        System.out.println("The name of the employee is "+name+" and salary is "+salary);
    }

}

public class LearnStreams3 {
    public static void main(String[] args) {
        List<Employeee> emplist=new ArrayList<>();
        emplist.add(new Employeee("Aman",101,30000));
        emplist.add(new Employeee("bman",102,40000));
        emplist.add(new Employeee("cman",103,50000));
        emplist.add(new Employeee("dman",104,60000));
        emplist.add(new Employeee("eman",105,70000));

        emplist.stream().filter(n->n.salary>40000).forEach(n-> System.out.println(n.name));


    }
}
