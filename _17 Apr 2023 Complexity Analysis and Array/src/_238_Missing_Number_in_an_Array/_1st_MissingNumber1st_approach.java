package _238_Missing_Number_in_an_Array;

import java.util.Scanner;

public class _1st_MissingNumber1st_approach {

    public static void main(String[] args) {

        int array[]={1,2,3,4,5,7,8};

        int Sum_number_in_array=0;
        // Time Complexity=O(n)

       for(int i=0;i< array.length;i++){
           //Sum of number of given array.
           Sum_number_in_array+=array[i];
       }

        // Sum of natural number.
        // Time Complexity=O(1)
        int n2=array.length+1;
        int Sum_Natural_Numbers=n2*(n2+1)/2;

        System.out.println("The Missing Element is:"+(Sum_Natural_Numbers-Sum_number_in_array));



        // Overall
        // Time Complexity=O(n)  Because we can use loop.
        //  Space Complexity=O(n)  Because we cannot use one more array.


    }
}
