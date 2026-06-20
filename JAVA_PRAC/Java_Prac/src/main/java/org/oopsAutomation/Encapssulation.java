package org.oopsAutomation;
class Credential{
     private String Password;

     void setPassword(String Password){
         this.Password=Password;
     }

     String getPassword(){
         return  Password;
     }
        }

public class Encapssulation {

    public static void main(String[] args) {
        Credential c=new Credential();
       c.setPassword("Aman@123");
        System.out.println(c.getPassword());
    }

}
