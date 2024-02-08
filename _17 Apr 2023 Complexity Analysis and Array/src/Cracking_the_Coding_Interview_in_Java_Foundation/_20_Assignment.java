/**
 *
 * Q1. Given an array of integers of length n, and an integer m, (m < n), divide the array into
 *  2 subArrays such that 1 part contains m elements and the other part contains the rest of
 *  the elements. This division has to be done such that the difference between the sum of
 *  elements of both the sub arrays is the maximum. You have to print the maximum difference
 *  in the sum possible.  (Medium)
 *
 * Input1:
 * N = 6
 * Arr[] = 7 4 6 0 8 2
 * M = 2
 * Output1:
 * 23
 *
 * Input2:
 * N = 3
 * Arr[] = 3 1 2
 * M = 1
 * Output2:
 * 4
 *
 */


package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Arrays;
import java.util.Scanner;

public class _20_Assignment {

    // this methods gives prefixSum Only.
    public static int [] printPrefixSum(int arr[]){

        Arrays.sort(arr);

        for (int i=1;i<arr.length;i++){

            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }

    // this method gives TotalSumOfArray and Both leftArraySum and rightArraySum
    static int  printTotalSumOfArrayElement(int arr[],int m){

        int prefixSum[]=printPrefixSum(arr);

        int totalSumOfArray=prefixSum[arr.length-1];
        int leftSubArraySum=0;


        leftSubArraySum += prefixSum[m-1];   // <-- why we use (m-1) instead of using m because of BaseIndexZero.


        int rightSubArraySum = totalSumOfArray - leftSubArraySum;

        return  Math.abs(rightSubArraySum - leftSubArraySum); // if we got any in negative that's why we used modulus.
    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of size of Array element:");
        int size = sc.nextInt();

        int arr[]=new int[size];

        System.out.println("enter the value of array elements:");
        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();

        }

        System.out.println("Enter the value of M:");
        int m=sc.nextInt();

        System.out.println(printTotalSumOfArrayElement(arr,m));
    }
}
