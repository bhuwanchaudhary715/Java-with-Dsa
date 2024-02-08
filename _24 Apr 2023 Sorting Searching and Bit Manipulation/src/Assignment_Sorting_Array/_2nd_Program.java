
/*
     Q2. WAP to sort an array in descending order using selection sort

     Input Array {3,5,1,6,0}
     Output Array: {6, 5, 3, 1, 0}

 */

package Assignment_Sorting_Array;

import java.util.Scanner;

class InsertionSorted{

    public static void printArray(int array[]){

        for(int i=0; i<array.length;i++){

            System.out.print(" "+array[i]);
        }
    }

    public static void insertionDescending(int array[]){

        for (int i=1; i<array.length;i++){

            int j=i;
            while ( j > 0 && array[j] > array[j-1] ){

                int temp=array[j];
                array[j]=array[j-1];
                array[j-1]=temp;

                j--;
            }
        }
    }
}

public class _2nd_Program {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Size:");
        int size=sc.nextInt();

        int array[]=new int[size];

        System.out.println("Enter the value of array elements:");
        for(int i=0; i<array.length;i++){

            array[i]=sc.nextInt();
        }

        InsertionSorted.insertionDescending(array);

        System.out.println("The sorted array in descending order:");
        InsertionSorted.printArray(array);

    }
}
