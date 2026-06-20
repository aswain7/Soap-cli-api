package org.example;

public class searchElementArray {
    public static void main(String[] args) {
        int[] a={2,5,7,9,3};
        boolean status=true;
        int b=5; //if present print success else failure

        for(int i=0;i<a.length;i++){
            if(a[i]==b){
                status=false;
                break;

            }
            else{
               status=true;
            }
        }
        if(status==false){
            System.out.println("Success");
        }
        else {
            System.out.println("Failure");
        }
    }
}
