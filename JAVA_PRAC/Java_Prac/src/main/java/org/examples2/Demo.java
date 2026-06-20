package org.examples2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        Employee e1=new Employee(101,"deepak",40000);
        e1.display();

        ArrayList<Employee> e3=new ArrayList<>();
        e3.add(new Employee(102,"deepak",40000));
        e3.add(new Employee(103,"rajdep",30000));
        e3.add(new Employee(104,"sandep",50000));
        e3.add(new Employee(105,"mandep",60000));

        Predicate<Employee> pr = e->(e.salary>40000 && e.emp_name.length()>3);
        System.out.println(pr.test(e1));
        for(Employee em2:e3) {
            if (pr.test(em2)) {
                System.out.println(em2.emp_name);

            }
        }

    }
}
