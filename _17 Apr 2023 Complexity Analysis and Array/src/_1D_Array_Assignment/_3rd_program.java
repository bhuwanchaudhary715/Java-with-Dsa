
  /*
Q3: Write a program to calculate the maximum element in the array.

Input 1: arr[] = {34,21,54,65,43}
Output 1: 65


Input 1: arr[] = {4,3,6,7,1}

Output 1: 7
  */

package _1D_Array_Assignment;
import java.util.Scanner;

public class _3rd_program {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Matrix Elements:");
        int n=sc.nextInt();

        int array[]=new int[n];

        System.out.println("Enter the Elements of Matrix:");
        for(int i=0;i< array.length;i++){

            array[i]=sc.nextInt();
        }

        int MaxNum = 0;

       for(int i=0; i< array.length;i++){

           MaxNum=Math.max(MaxNum,array[i]);
       }

        System.out.println(MaxNum);

    }
}
