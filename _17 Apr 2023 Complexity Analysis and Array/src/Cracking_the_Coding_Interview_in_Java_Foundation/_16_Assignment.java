
/*

       Q2. Given an integer array arr, return the number of consecutive sequences(subArrays) with
           odd sum.

           Input1:
                  N = 3
                  [1,3,5]
           Output1:
                   4

           Input2:
                  N = 3
                  [2,4,6]
           Output2:
                   0
 */


package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _16_Assignment {

    public static int returnNumberOfConsecutiveSequence(int arr[]){

        int oddSum=0;

        for (int i=1;i<arr.length;i++){

                if(arr[i]%2 !=0 && arr[i-1]%2 !=0){

                    return  arr[i]+arr[i-1];
                }
        }
        return -1;
    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of size of array element:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of Array are:");
        for (int i=0; i < arr.length; i++){

            arr[i]=sc.nextInt();

        }


        int oddSum = returnNumberOfConsecutiveSequence(arr);
        System.out.println(oddSum);

    }
}
