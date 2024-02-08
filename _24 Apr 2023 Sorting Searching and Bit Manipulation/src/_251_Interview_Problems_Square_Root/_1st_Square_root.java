package _251_Interview_Problems_Square_Root;

import java.util.Scanner;

public class _1st_Square_root {

    // Function Definition
    public static  int squareRoot(int n){

        int low=0, high=n, mid, result=0;

        while (low <= high){

            mid=low+(high-low)/2;                       // Time complexity=O(log(n))
            long value= mid*mid;                         // Space complexity=O(1)

            if(value==n){
                // perfect Square root of the given number
                return mid;

            }else if(value<n){
               // store the mid as we need to report the floor value in case of non perfect square root
                result=mid;

                // right side of an array
                low=mid+1;

            } else {

                // left side of an array
                high=mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:");
        int n=sc.nextInt();

        int result =_1st_Square_root.squareRoot(n);

        System.out.println("The Square root is:"+result);

    }
}
