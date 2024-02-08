
  /* Q1: Write a program to print the sum of all the elements present on even indices in the given array.

    Input 1: arr[] = {3,20,4,6,9}
    Output 1: 16

    Input 1: arr[] = {4,3,6,7,1}
    Output 1: 11    */

package _1D_Array_Assignment;
import java.util.Scanner;
class PrintSum{

    public static int sumOfAllEvenIndicesArray(int array[]){

        int sum=0;
        for(int i=0;i<array.length;i++){

            if( i % 2 == 0){

                sum+=array[i];
            }
        }
        return sum;
    }
}

public class _1st_program_UsingFunction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();

        int array[]=new int[n];

        System.out.println("Enter the Elements of Matrix:");
        for(int i=0;i< array.length;i++){

            array[i]=sc.nextInt();
        }

      int sum = PrintSum.sumOfAllEvenIndicesArray(array);

        System.out.print("The sum of all the elements present on even indices is:"+ sum);
    }
}
