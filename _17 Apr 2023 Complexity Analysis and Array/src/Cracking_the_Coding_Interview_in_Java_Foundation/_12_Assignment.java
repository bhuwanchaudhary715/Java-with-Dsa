
/*
    Q3 - Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
         missing number from the first N integers. There are no duplicates in the list.    ( Medium )

         Input1: n = 8
                 arr[] = {1, 2, 4, 6, 3, 7, 8}
         Output1: 5


         Input2: n = 5
                 arr[] = {1, 2, 3, 5}
         Output2: 4
 */


package Cracking_the_Coding_Interview_in_Java_Foundation;

  public class _12_Assignment {

      // finding sum of natural number only.
      public static int printSumOfNaturalNum(int array[]){


          int n= array.length+1;
          int sumNatural=n*(n+1)/2;

          return sumNatural;
      }

      // Finding missing number only.
      public static int printMissingNumber(int array[]){

          int sumNatural=printSumOfNaturalNum(array);

          int sumOf_N_arrayNumber = 0;

          for (int i=0;i<array.length;i++){

              sumOf_N_arrayNumber+=array[i];

          }

          return sumNatural-sumOf_N_arrayNumber;
      }

     public static void main(String[] args) {


         int arr[] = {1, 2, 4, 6, 3, 7, 8};

         System.out.println("The Missing elements is:"+printMissingNumber(arr));

    }
}
