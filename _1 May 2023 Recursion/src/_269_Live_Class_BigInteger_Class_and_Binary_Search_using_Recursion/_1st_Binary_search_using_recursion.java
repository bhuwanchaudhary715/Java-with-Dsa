package _269_Live_Class_BigInteger_Class_and_Binary_Search_using_Recursion;

import java.util.*;
 class BinarySearch_using_Recursion {

     public static int binarySearch(int array[], int low, int high, int target) {

         int result=-1;

         while (low <= high) {

             int mid = low + (high - low) / 2;
             if (array[mid] == target) {

                 return mid;

             } else if (array[mid] < target) {

               return binarySearch(array, mid + 1, high, target);

             } else {

               return binarySearch(array, low, mid - 1, target);

             }
         }
         return result;
     }
 }

   public class _1st_Binary_search_using_recursion {

         public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Array Size:");
        int size=sc.nextInt();

        int array[]=new int[size];

        System.out.println("Enter the Array Elements:");
        for(int i=0; i< array.length;i++){

            array[i]=sc.nextInt();
        }

        System.out.println("Enter the value of target:");
        int target=sc.nextInt();

        int low=0;
        int high=array.length-1;

        int result=BinarySearch_using_Recursion.binarySearch(array,low,high,target);

       if(result==-1){

           System.out.println("Array element is not Found:");

       }else {

           System.out.println("The elements is present in given index is:"+result);
       }
    }
}
