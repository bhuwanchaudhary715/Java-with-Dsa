package _253_Sorting_Bubble_Sort;

import java.util.Scanner;

class SortingElement{

    public static void printArray(int arr[]){

        for(int i=0; i<arr.length;i++){

            System.out.print(arr[i]);
        }
    }

    public  static void bubbleSort(int arr[]){

        for(int i=0; i<arr.length;i++){

            for(int j=0; j<arr.length-1-i ;j++){

                if( arr[j] > arr[j+1] ){

                    int temp = arr[j];
                     arr[j]  = arr[j+1];
                     arr[j]  = temp;

                }
            }
        }
    }
}
public class _2nd_Bubble_Sort {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of an Array:");
        int n=sc.nextInt();

        int array[]=new int[n];

        System.out.println("Enter the Elements of Given array:");
        for(int i=0; i<array.length;i++){

           array[i]=sc.nextInt();
        }

        System.out.println("Sorted Array are:");
        Sorting.printValue(Sorting.bubbleSort(array));
    }
}
