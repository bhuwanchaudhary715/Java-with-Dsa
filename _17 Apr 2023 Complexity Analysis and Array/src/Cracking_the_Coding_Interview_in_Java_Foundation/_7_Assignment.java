
/*

   Q3 - Given an array arr[] and an integer K where K is smaller than size of array, the task is to
        find the Kth smallest element in the given array. It is given that all array elements are
        distinct.                    (Easy)

        Input1:  N = 6 , arr[] = 7 10 4 3 20 15 , K = 3
        Output1: 7

        Input2:  N = 5  , arr[] = 7 10 4 3 20  , K = 1
        Output2: 3

 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Arrays;
import java.util.Scanner;

public class _7_Assignment {
    public static int printSmallestKthElements(int array[],int k){

        Arrays.sort(array);
        int ans=0;
        for(int i=0;i<array.length;i++){

            if( i+1 == k){

                ans=array[i];
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the array:");
        int size = sc.nextInt();

        int array[]=new int[size];

        System.out.println("Enter the value of Matrix Elements are:");
        for (int i=0;i<array.length;i++){

            array[i]=sc.nextInt();
        }

        System.out.println("Enter the value of K is :");
        int k=sc.nextInt();

        int ans=printSmallestKthElements(array,k);

        System.out.println("The Smallest Kth  elements is:"+ans);
    }
}
