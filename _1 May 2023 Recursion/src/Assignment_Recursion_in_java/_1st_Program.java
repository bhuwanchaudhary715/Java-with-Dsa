
/*
      Q1 : Given an integer, find out the sum of its digits using recursion.

       Input: n= 1234
       Output: 10

       Explanation: 1+2+3+4 = 10

 */

package Assignment_Recursion_in_java;

import java.util.Scanner;

public class _1st_Program {

      public static int  sumOfItsDigits(int number){

          int sum , modulus ;

        if( number == 0){

            return 0;

        } else {

            sum =number/10;     //  <---   This line is used to remove the number from RHS sides .

            modulus=number %10;   //   <---   This Line is used to stored reminder .

            return sumOfItsDigits(sum) + modulus;   //    <-- Recursive calling function .
        }

      }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Number:");
        int number=sc.nextInt();


        int result = _1st_Program.sumOfItsDigits(number);
        System.out.println("Output:"+result);

    }
}
