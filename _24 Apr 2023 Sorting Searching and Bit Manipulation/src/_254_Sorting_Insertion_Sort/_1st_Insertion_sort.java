package _254_Sorting_Insertion_Sort;

import java.util.Arrays;
public class _1st_Insertion_sort {
    public static void insertionSorted(int arr[]){

        for(int i=1; i<arr.length;i++){

            int j=i;
            while( j > 0 && arr[j] < arr[j-1] ) {

                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;
            }
        }
    }

    public static void main(String[] args) {

       int arr[]={10,20,40,65,55,45};

       _1st_Insertion_sort.insertionSorted(arr);

        System.out.println("Sorted array are:");
        System.out.println(Arrays.toString(arr));
    }
}
