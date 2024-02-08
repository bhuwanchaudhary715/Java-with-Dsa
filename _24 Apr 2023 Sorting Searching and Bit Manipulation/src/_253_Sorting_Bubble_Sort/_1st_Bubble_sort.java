package _253_Sorting_Bubble_Sort;

import java.util.Scanner;
class Sorting{
    public static void printValue(int arr[]){

        for(int i=0; i<arr.length;i++){

            System.out.print(" "+arr[i]);
        }
    }
    public static int [] bubbleSort(int arr[]){

        int temp=0;
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length-1-i;j++){

                if( arr[j] > arr[j+1] ){

                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
public class _1st_Bubble_sort {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of an Array");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the Matrix elements:");
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();
        }

        System.out.println("Sorted Array are");
        Sorting.printValue( Sorting.bubbleSort(arr));
    }
}
