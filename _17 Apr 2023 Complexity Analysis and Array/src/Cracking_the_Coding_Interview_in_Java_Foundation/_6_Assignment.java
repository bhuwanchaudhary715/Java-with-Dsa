/*

  Q1 - Given an unsorted array arr[] of size N having both negative and positive integers, place
       all negative elements at the end of array without changing the order of positive elements
       and negative elements.        (medium)

       Input1 : N = 8  ,  arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }

       Output1 :    1 3 2 11 6 -1 -7 -5

       Input2:  N = 4 , arr[] = {-3, -1, 0, -7}

       Output1:      0 -3 -1 -7

 */

package Cracking_the_Coding_Interview_in_Java_Foundation;
import java.util.*;

public class _6_Assignment {

    public static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);
        }
    }
    public static int [] printPositiveAndNegativeNumber(int arr[] ){

        int n=arr.length;
        int array2[]=new int[n];

        int j=0;
        for (int i=0;i<arr.length;i++){

            if( arr[i] >= 0){

                array2[j++]=arr[i];

               }
            }

        for (int i=0;i<arr.length;i++) {

            if (arr[i] < 0) {

                array2[j++] = arr[i];

            }
        }

        return array2;
    }

    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of array Size:");
        int size = sc.nextInt();

        int arr[]= new int[size];

        System.out.println("Enter the Array Elements are:");
        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();
        }

       int arr2[]=printPositiveAndNegativeNumber(arr);

        printArray(arr2);

    }
}
