package _254_Sorting_Insertion_Sort;

import java.util.Scanner;

class Sorting{

    public static void printArray(int arr[]){

        for(int i=0; i<arr.length;i++){

            System.out.print(" "+arr[i]);
        }
    }

    public static void insertionSort(int arr[]){

        for(int i=1; i<arr.length; i++){

            int j=i;
            while ( j>0 && arr[j]<arr[j-1]){

                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;                                // Time Complexity = O(n^2)
            }                                       // Space Complexity = O(1)
        }
    }
}

public class _2nd_Insertion_sorting {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:");
        int n=sc.nextInt();

        int array[]=new int[n];

        System.out.println("Enter the Array Elements:");
        for(int i=0; i<array.length;i++){

            array[i]=sc.nextInt();

        }

        Sorting.insertionSort(array);

        System.out.println("The Sorted array are:");
        Sorting.printArray(array);

    }
}
