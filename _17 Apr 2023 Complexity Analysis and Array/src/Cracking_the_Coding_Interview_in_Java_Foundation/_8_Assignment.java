
/*
   Q4 - Given an unsorted array A of size N that contains only non-negative integers, find a
        continuous sub-array which adds to a given number S.
        In case of multiple subArrays, return the subArray which comes first on moving from left to right.
        You need to print the start and end index of answer subArray.

        Input1: N = 5, S = 12 , A[] = {1,2,3,7,5}
        Output1: 2 4

        Input2: N = 5, S = 5 ,  A[] = {1,2,3,7,5}
        Output2: 2 3
 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _8_Assignment {

    public static void main(String[] args) {

        int n=5;

        int s=12;

        int arr[]={1,2,3,7,5};


        int l=0;  // LeftRow
        int r=0; // RightRow

        int sum=0;

         while (r < n){

             sum+=arr[r];

             if( sum > s){

                 while ( sum > s && l < r){

                     sum-=arr[l];
                     l++;
                 }
             }

             if (sum == s){

                 System.out.print(l+" ");
                 System.out.println(r);
                 break;
             }
             r++;
         }
    }
}
