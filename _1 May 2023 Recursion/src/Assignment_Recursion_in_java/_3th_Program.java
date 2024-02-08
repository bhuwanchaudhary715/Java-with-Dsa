
/*
         Q3: Print the max value of the array [ 13, 1, -3, 22, 5].

 */



package Assignment_Recursion_in_java;

import java.util.Scanner;

public class _3th_Program {

    // function definition
    public static int  printMaxValue(int array[],int start,int end){

       //  Base case: if the array contains only one element, return that element.
        if( start == end ){

            return array[start];
        }

        // Recursive case: divide the array into two halves
        int mid = (start+end)/2;
        int left = printMaxValue(array,start,mid);
        int right = printMaxValue(array,mid+1,end);

        // Return the maximum of the two values.
        return Math.max(left,right);

    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Size:");
        int size=sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the value of Array Elements:");
        for (int i=0; i<array.length;i++){

            array[i]=sc.nextInt();

        }

        int start=0;
        int end=array.length-1;

        int maxValue= _3th_Program.printMaxValue(array,start,end);

        System.out.println("The Max array element is:"+maxValue);

    }
}
