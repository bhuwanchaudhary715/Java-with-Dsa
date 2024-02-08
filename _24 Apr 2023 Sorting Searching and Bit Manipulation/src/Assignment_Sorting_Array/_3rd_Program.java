   /*

     Q2. WAP to sort an array in descending order using selection sort

     Input Array {3,5,1,6,0}
     Output Array: {6, 5, 3, 1, 0}

   */




package Assignment_Sorting_Array;

import java.util.Scanner;

public class _3rd_Program {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of array Size");
        int size=sc.nextInt();

        int array[]=new int[size];

        System.out.println("Enter the value of Array elements:");
        for(int i=0; i<array.length; i++){

            array[i]=sc.nextInt();
        }


    }
}
