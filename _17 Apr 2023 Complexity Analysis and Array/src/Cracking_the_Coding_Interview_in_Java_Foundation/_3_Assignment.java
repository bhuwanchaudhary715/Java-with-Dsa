/*
     Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even
         elements.  (Easy)

         Output:
               2
               4
               6
               8
 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _3_Assignment {

    public static void printAllEvenUsingForEachLoop(int array[]){

        for ( int i : array) {

            if( i % 2 == 0)

            System.out.println(i+" ");

        }
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8 };
        printAllEvenUsingForEachLoop(arr);

    }
}
