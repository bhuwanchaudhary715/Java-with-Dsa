/*
Q2: Write a program to traverse over the elements of the array using for each loop and print all even
elements.

Input-1: arr[] = {34,21,54,65,43};
Output-1: 34 54

Input-1: arr[] = {4,3,6,7,1};
Output-1: 4 6

  */
package _1D_Array_Assignment;

import java.util.Scanner;

public class _2nd_program {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array Elements:");
        int n=sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the value of Array Matrix:");

        for(int i=0;i<array.length;i++){

            array[i]=sc.nextInt();
         }

        for(int i : array){

            if( i % 2 == 0 ){

                System.out.println(" "+i);
            }
        }
     }
  }
