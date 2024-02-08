
/*

    Q2. Given an array of positive and negative numbers, arrange them in an alternate fashion such that
        every positive number is followed by a negative and vice-versa maintaining the order of appearance.
        The number of positive and negative numbers need not be equal. Begin with a negative number.
        If there are more positive numbers, they appear at the end of the array. If there are more negative
        numbers, they too appear at the end of the array.  ( Medium )

        Input 1:
                 N = 6
                 arr[] = {1, 2, 3, -4, -1, 4}
        Output 1:
                arr[] = {-4, 1, -1, 2, 3, 4}

        Input 2:
                 N = 4
                arr[] = {1, 2, 3, -4}
        Output 2:
                arr[] = {-4, 1, 2, 3}

 */



package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _14_Assignment {

    // This method is print only Array Elements .

    static  void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);

        }
    }

    public static int[]  negativeAndPositiveArray(int arr[]){

        int negative=0;
        int positive=0;

        for(int i=0;i<arr.length;i++){

            if( arr[i] < 0){

                negative++;

            }else {

                positive++;

            }
        }

        int n=arr.length; // <-- This line gives array length.
        int arr1[]=new int[negative];
        int arr2[]=new int[positive];

        int output[]=new int[n];  //  <-- This line is Output Array.

        int idx1=0;
        int idx2=0;

        for(int i=0;i<arr.length;i++){


            if ( arr[i] < 0 ){

                arr1[idx1++]=arr[i];
            }

            if( arr[i] > 0 ){

                arr2[idx2++]=arr[i];
            }
        }

        int n1=arr1.length;
        int n2=arr2.length;
        int idx3=0;


        for(int i=0;i< arr.length;i++) {

            if (n1 > 0){

                output[idx3++] = arr1[i];
                n1--;
            }

            if( n2 > 0 ) {

                output[idx3++] = arr2[i];
                n2--;

            }
        }
         return output;
    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Size array:");
        int size = sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter the value of Array elements:");
        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();

        }

       int output[] = negativeAndPositiveArray(arr);
        printArray(output);


    }
}
