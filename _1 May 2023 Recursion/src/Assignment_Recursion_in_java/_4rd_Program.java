
/*
        Q4 : Find the sum of the values of the array [92, 23, 15, -20, 10].
 */

package Assignment_Recursion_in_java;

import java.util.Scanner;

public class _4rd_Program {

        //  Function definition.
    public static int sumArrayElement(int array[],int start,int end){

        //  Base case condition.
        if( start > end ){

            return 0;
        }

        int currentElement=array[start];
        int remaining=sumArrayElement(array,start+1,end); // recursive calls.

        return currentElement+remaining;
    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Size of Array:");
        int size = sc.nextInt();

        int array[] =new int[size];

        System.out.println("Enter the value of Array Elements:");
        for (int i=0; i<array.length;i++){

            array[i]=sc.nextInt();

        }

        int result =_4rd_Program.sumArrayElement(array,0,array.length-1);

        System.out.println("The Sum of "+result);
    }
}
