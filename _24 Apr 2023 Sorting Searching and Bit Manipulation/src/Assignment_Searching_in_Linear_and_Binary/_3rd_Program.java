
/*
   Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.

   Input 1: arr = [0 0 0 0 1 1 1 1 1 1]
   Output 1: 6

   Input 2: arr = [ 0 0 0 0 0 1 1]
   Output 2: 2

 */

package Assignment_Searching_in_Linear_and_Binary;

import java.util.Scanner;

 class Sorted{

     public static int countTotalNumber(int array[]){

         int count=0;
         for(int i=0; i<array.length;i++){

             if(array[i]==1){

                 count++;
             }
         }
         return count;
     }
 }

public class _3rd_Program {

    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Size:");
        int size =sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the value of array elements:");
        for (int i=0; i<array.length;i++){

            array[i]=sc.nextInt();

        }

        int result=Sorted.countTotalNumber(array);
        System.out.println("The total number of 1's elements:"+result);
    }
}
