package org.examples2;

import java.util.ArrayList;
import java.util.function.Function;

public class Demo4 extends Demo {
    public static void main(String[] args) {
        ArrayList<Employee>  emp_list = new ArrayList<Employee>();
        ArrayList<Employee> e3=new ArrayList<>();
        e3.add(new Employee(102,"deepak",40000));
        e3.add(new Employee(103,"rajdep",30000));
        e3.add(new Employee(104,"sandep",50000));
        e3.add(new Employee(105,"mandep",60000));


        Function<Employee,Integer> fn=e->{
            int sal=e.salary;
            if(sal>=0 && sal<=20000){
                return sal*10/100;
            }
            else if (sal>20000 && sal <=40000){
                return sal*20/100;
            }
            else if (sal>40000 && sal <=60000){
                return sal*30/100;
            }
            else{
                return 0;
            }

        };
        for(Employee e5:e3)
        {
            int bonus=fn.apply(e5);
            System.out.println(e5.emp_name+" "+bonus);

        }
    }
}
