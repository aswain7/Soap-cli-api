package org.examples2;

public class secondlargest2 {
    public static void main(String[] args) {
        int[] a={7,8,2,3,9};
        //Second Largest number is 8 without finding the largest
        int largest=0,second_largest=0;
        for(int i:a){
            if(i>largest){
                second_largest=largest;
                largest=i;

            }
            else if(i>second_largest && i!=largest){
                second_largest=i;
            }

        }
        System.out.println(second_largest);
    }
}
