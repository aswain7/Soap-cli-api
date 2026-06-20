package org.examples2;

public class Employee {
    int emp_id;
    String emp_name;
    int salary;
    Employee(int emp_id,String emp_name,int salary){
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.salary=salary;
    }
    void display(){
        System.out.println("emp id is "+emp_id+" and emp_name is "+emp_name+" and emp_Salary is "+salary);
    }
    public static void main(String[] args) {



    }
}
