
/*
 Q2 - Given an array of size n, find the total number of occurrences of given number x.    ( Easy )

      input1:
             n=7
             arr[]={3,5,0,7,8,3,0}
             x=0
      Output1:
            2

      input2:
            n=6
            arr[]={1,2,0,8,6,8}
            x=3
      Output2:
            0

 */


package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _11_Assignment {

    static int printOccurrenceElement(int arr[],int x){

        int count=0;

        for(int i=0;i<arr.length;i++){

            if( arr[i]== x){

                count++;
            }
        }
       return count;
    }

    public static void main(String[] args) {


        int arr[]={3,5,0,7,8,3,0};

        System.out.println(printOccurrenceElement(arr,0));
    }
}
