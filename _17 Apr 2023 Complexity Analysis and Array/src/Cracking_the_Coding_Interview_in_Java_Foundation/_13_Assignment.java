
/*

    Q1. Given an array arr[] of size n, find the first repeating element. The element should occur more than
    once and the index of its first occurrence should be the smallest. If no repeating element exists, print -1.
    ( Easy )

     Input 1:
              n = 7
              arr[] = {1, 5, 3, 4, 3, 5, 6 }
     Output 1:
              2


     Input 2:
              n = 4
              arr[] = {2, 5, 3, 4}

     Output 2:
              -1

 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _13_Assignment {

    public static int  printFirstRepeatOccurrence(int arr[]){

        for (int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if( arr[i] == arr[j]){
                    
                    return i+1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of size:");
        int size=sc.nextInt();


        int arr[] = new int[size];

        System.out.println("Enter the value of Array elements:");

        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();

        }

        int ans = printFirstRepeatOccurrence(arr);

        System.out.println("The repeated index is:"+ans);


    }
}
