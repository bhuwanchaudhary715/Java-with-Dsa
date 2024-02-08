/*

   Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method
   for calculating the minimum element.  ( Easy )

   Output:
         -4
 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _4_Assignment {

    public static int  minimumElementInArray(int array[]){

        int ans=100000;
        for(int i=0;i<array.length;i++){

            if(array[i] < ans){

                ans=array[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {


        int arr[]= {2, -3, 5, 8, 1, 0, -4};

        System.out.println(minimumElementInArray(arr));
    }
}
