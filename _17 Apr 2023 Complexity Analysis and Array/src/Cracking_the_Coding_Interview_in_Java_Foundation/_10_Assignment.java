
/*
   Given an array sorted in increasing order of size n and an integer x, find if there exists a
   pair in the array whose absolute difference is exactly x.( n > 1)     ( Medium )

  Input1:
       N = 5
       Arr[] = [5,10,15,20,26]
       x= 10

  Output1: Yes

 Input2:
        N = 7
        Arr[] = [1, 2, 3, 4, 5, 6, 7]
        x= 0

Output2:  No

 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _10_Assignment {

    public static void printDifferenceElement(int array[] , int x){

        for (int i=0;i<array.length;i++){

            for(int j=i+1;j<array.length;j++){

                 if (array[j] - array[i] == x){

                     System.out.println("yes");
                     return;

                 }
            }
        }

        System.out.println("No");
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};

        printDifferenceElement(arr,0);

    }
}
