
/*
     Write a Java program to test the equality of two arrays . (Easy)

           2 5 7 9 11
  Input1:
           2 5 7 9 13

  Output1:  false


           2 5 7 9 12
   Input2:
           2 5 7 9 12

   Output2: true

 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.*;
public class _9th_Assignment {

    public static boolean printEqualArray(int arr1[],int arr2[]){

        boolean flag=true;
        for (int i=0;i<arr1.length;i++){

            if( arr1[i] != arr2[i]){

                flag=false;
                break;

            }
        }


        return flag;
    }

    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);

        System.out.println("Enter the array size:");
        int size=sc.nextInt();

        int arr1[]=new int[size];
        int arr2[]=new int[size];

        System.out.println("Enter the Array-1 Elements:");
        for(int i=0;i<arr1.length;i++){

            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the Array-2 Elements:");
        for(int i=0;i<arr2.length;i++){

            arr2[i]=sc.nextInt();
        }

        System.out.println(printEqualArray(arr1,arr2));


    }
}
