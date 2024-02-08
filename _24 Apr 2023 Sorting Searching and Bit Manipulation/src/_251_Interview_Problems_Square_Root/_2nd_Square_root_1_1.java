package _251_Interview_Problems_Square_Root;

import java.util.Scanner;

class InterviewProblem {

    public static int squareRoot(int num){

        int low=0 , mid , high=num ,result=0;

        while(low <= high){

            mid=low+(high-low)/2;
            long value =mid*mid;

            if(value==num){

                return mid;

            } else if ( value > num) {

                high=mid-1;

            } else if( value < num ){

                result=mid;
                low=mid+1;

            }
        }
        return result;
    }
}

public class _2nd_Square_root_1_1 {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int num=sc.nextInt();

        int result = InterviewProblem.squareRoot(num);

        System.out.println("The Square root value is:"+result);


    }
}
