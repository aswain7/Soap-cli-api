package org.example;

public class secondLargestWithoutSorting {
    public static void main(String[] args) {
        int[] a={0,-1,0,0}; //7
        int largest=Integer.MIN_VALUE,second_largest=Integer.MIN_VALUE;
        for(int no:a){
            if(no>largest){
                second_largest=largest;
                largest=no;
            } else if (no>second_largest && no!=largest) {
                second_largest=no;
                
            }

        }
        System.out.println(second_largest);
        }

    }

