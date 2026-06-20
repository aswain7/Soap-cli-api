package org.concepts;


 class Info {
    String Emp_name;
    int emp_id;
    String Company;

    void display(){
        System.out.println(Emp_name+" "+emp_id+" "+Company);
    }

    void Emp_details(String Emp_name,String Company,int emp_id){
        this.Emp_name=Emp_name;
        this.Company=Company;
        this.emp_id=emp_id;

    }
}
public class Employee {
    public static void main(String[] args) {
        Info i = new Info();
        i.Emp_details("Rajesh","Cognizant",849049);
        i.display();
        i.Emp_details("Soumen","Cognizant",849048);
        i.display();
        i.Emp_details("Ramesh","Cognizant",849047);
        i.display();


    }
}
