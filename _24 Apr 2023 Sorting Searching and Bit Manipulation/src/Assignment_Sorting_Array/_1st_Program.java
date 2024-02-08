
/*
     Q1. Write a program to sort an array in descending order using bubble sort.

     Input Array {3,5,1,6,0}
     Output Array: {6, 5, 3, 1, 0}

 */

package Assignment_Sorting_Array;

import java.util.Scanner;

class Sorting{

    public static void printArray(int array[]){

        for(int i=0; i<array.length;i++){

            System.out.print(" "+array[i]);
        }
    }

    public static void bubbleSort(int array[]){

        for(int i=0; i<array.length; i++){

            for (int j=0; j<array.length-i-1; j++){

                if(array[j] < array[j+1]){

                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }
        }
    }
}

public class _1st_Program {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Size:");
        int size =sc.nextInt();

        int array []=new int[size];

        System.out.println("Enter the value of Array elements:");
        for(int i=0; i<array.length;i++){

            array[i]=sc.nextInt();
        }

        Sorting.bubbleSort(array);

        System.out.println("The Sorted array in Descending order:");
        Sorting.printArray(array);
    }
}
