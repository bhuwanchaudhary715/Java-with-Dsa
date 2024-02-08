/*

  Q1. Given an integer m, n, and n integers, return true if the number of unique integers among the n
      integers is greater than or equal to m, else return false.(Integers appearing multiple times are all
      considered as 1 unique integer)    ( Easy )

      Input1:
              5
             10
      1 2 1 4 5 2 1 1 2 2

      Output1:
              false


      Input2:
              9
             15
      1 4 5 0 9 8 3 7 3 2 6 8 11 15 23

      Output2:
              true

 */


package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Arrays;
import java.util.Scanner;

public class _15_Assignment {

    public static boolean returnUniqueElement(int arr[],int m){

        Arrays.sort(arr);

        int countUnique=0;
        for (int i=1;i<arr.length;i++){

            if(arr[i-1] != arr[i]){

                countUnique++;
            }
        }

        return  countUnique >= m ;
    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of m and n are :");
        int m= sc.nextInt();
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the value of Array elements:");
        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();

        }

        boolean result = returnUniqueElement(arr,m);

        System.out.println(result);
    }
}
