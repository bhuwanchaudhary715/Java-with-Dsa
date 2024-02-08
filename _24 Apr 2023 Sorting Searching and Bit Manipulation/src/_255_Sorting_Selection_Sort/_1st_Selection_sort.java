package _255_Sorting_Selection_Sort;

import java.util.Scanner;

class Sorting{

    public static void printArray(int arr[]){

        for(int i=0; i<arr.length;i++){

            System.out.print(" "+arr[i]);
        }
    }

    public static void selectionSort(int arr[]){

        for(int i=0; i<arr.length;i++){

          //  i represents the current index

            int mid_index=i;
            
            for (int j=i+1; j<arr.length;j++){

                if(arr[j] < arr[mid_index]){

                    mid_index=j;
                }
            }

            if (mid_index!=i){
                  //
                int temp = arr[i];
                arr[i] = arr[mid_index];
                arr[mid_index] = temp;
            }
        }
    }
}

public class _1st_Selection_sort {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:");
          int n=sc.nextInt();

          int array[] = new int[n];

        System.out.println("Enter the array elements:");
        for( int i=0; i<array.length;i++){

            array[i]=sc.nextInt();
        }

        Sorting.selectionSort(array);

        System.out.println("The Sorted array are:");
        Sorting.printArray(array);
    }
}
