
/*Q1. Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.  ( Easy )

        Output:
        2
        6
        0
        4

  */

package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _1_Assignment {

    public static void positiveValue(int array[]){

        for(int i=0;i<array.length;i++){

            if( array[i] > -1 ){

                System.out.print(array[i]+" ");
            }
        }
    }

    public static void main(String[] args) {

        int arr[]={2, 6, -5, -1, 0, 4, -9};
        positiveValue(arr);

    }
}
