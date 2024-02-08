/**
 *
 * Q2. Given an integer array arr consisting of 0’s and 1’s only, return the max length of sequence
 * which contains equal numbers of 0 and 1. If no such subarray exists, print -1.  ( Medium )
 *
 * Input1:
 * N = 7
 * arr=[0,1,1,0,1,1,1]
 * Output1:
 * 4
 *
 * Inpu t2:
 * N = 3
 * arr=[1,1,1]
 * Output2:
 * -1
 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Arrays;
import java.util.Scanner;

public class _21_Assignment {

    static int printConsistingZeros_Ones(int arr[]){

        Arrays.sort(arr);

        int sum=0;


        for(int i=0;i<arr.length;i++) {

            if (arr[i] == 0) {

                sum+=-1;

            }
        }


        for (int i=0;i<arr.length;i++){


            if (arr[i]==1) {

                if( sum < 0){

                    return sum * sum;
                }
            }
        }

        return -1;
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

        System.out.println(printConsistingZeros_Ones(arr));
    }
}
