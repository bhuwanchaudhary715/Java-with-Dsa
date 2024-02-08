
/*
    Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0} Peak element is the one which
        is greater than its immediate left neighbor and its immediate right neighbor.
        Leftmost and rightmost element cannot be a peak element.    (Medium)

       Output:
              4

 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _5_Assignment {

    public static void printPeakElement(int array[]){

        for (int i=1;i<array.length-1;i++){

            if( array[i-1] < array[i] && array[i] > array[i+1]){

                System.out.println(" "+array[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {

        int arr[]= { 1, 1, 3, 4, 2, 3, 5, 7, 0 };

        printPeakElement(arr);

    }
}
