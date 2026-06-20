package org.example;

public class MissingNumberinArray {
    public static void main(String[] args) {
        int sum=0;
        int totalsum=0;
        int[] a={1,2,5,3,4,7}; //missing number is 6
        for(int i=0;i<a.length;i++){ //getting the sum of existing array
            sum=sum+a[i];
        }

//        System.out.println(sum);
        int max=a[0],min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            } else if (a[i]<min) {
                min=a[i];

            }
        }
//        System.out.println(max);
//        System.out.println(min);

        for(int i=min;i<=max;i++){
            totalsum=totalsum+i;
        }
        System.out.println("Final Result >> Missing number is -- "+(totalsum-sum));
    }
}
