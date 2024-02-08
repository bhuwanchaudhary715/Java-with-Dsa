package _249_Searching_Binary_Search;

import java.util.Scanner;

 class Searching {

     public static int binarySearching(int arr[],int target){

         int low=0, high=arr.length-1 , mid=-1;

         while(low<=high){

             mid=(low+high)/2;

             if(arr[mid] == target){

                 return mid;
             }
             else if (arr[mid]<target){

                 low=mid+1;
             }
             else {

                 high=mid-1;
             }
         }
         return mid ;
     }
 }

public class _2nd_Binary_search_using_function {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array:");             // Time Complexity= o(log(n))
        int n = sc.nextInt();                                       // Space Complexity=O(1)

        int array[] = new int[n];

        System.out.println("Enter the array elements Matrix:");
        for (int i = 0; i < array.length; i++) {

            array[i] = sc.nextInt();
        }

        System.out.println("Enter the target Elements:");
        int target = sc.nextInt();

      int mid = Searching.binarySearching(array,target);

        if( mid==-1 ){

            System.out.println("Given array is not Found:");

        }else {

            System.out.println("Given array is found in index:"+mid);
        }



    }
}
