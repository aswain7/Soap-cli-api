package org.examples2;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//I want the salaries where the employee salary is more than 40000 and all the employee details and id

public class Demo6 {
    public static void main(String[] args) {
//        ArrayList<Employee> emp_list = new ArrayList<Employee>();
        ArrayList<Employee> e3=new ArrayList<>();
        e3.add(new Employee(102,"deepak",40000));
        e3.add(new Employee(103,"rajdep",30000));
        e3.add(new Employee(104,"sandep",50000));
        e3.add(new Employee(105,"mandep",60000));

        Function<Employee,Integer> fn=e->{
            int sal=e.salary;
            if(sal>0 && sal<=10000){
                int bonus=sal*10/100;
                return bonus;
            }
            else if(sal>10000 && sal<=40000){
                int bonus=sal*20/100;
                return bonus;
            }
            else if(sal>40000 && sal<=60000){
                int bonus=sal*40/100;
                return bonus;
            }
            else{
                int bonus=sal*50/100;
                return bonus;
            }
        };
        Predicate<Integer> p1=p->p>10000;
        Consumer<Employee> c=c1->{
            System.out.println(c1.emp_name+" "+c1.emp_id+" "+c1.salary);
        };
        for(Employee e:e3){
            int actual_bonus=fn.apply(e);
            if(p1.test(actual_bonus)){
                System.out.println(actual_bonus);
//                System.out.println(e.emp_name);
//                System.out.println(e.emp_id);
                c.accept(e);
            }

        }

    }
}
