
/*
    Q5. Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum
     of every digit in that number raised to the power of total digits in that number is equal to the number.

    Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number. (Easy)

    Input1 : 153
    Output1 : Yes

    Input 2 : 134
    Output2 : N0
 */

package Assignment_Recursion_in_java;

import java.util.Scanner;

public class _5th_Program {

    public static int printArmstrongNumber(int number) {

        int remainder;
        int  cube=0 , remainNum  ;
        if (number == 0) {

            return 0;

        } else {

            remainder = number % 10;
            remainNum= number /10;

            return printArmstrongNumber(remainNum);

        }
    }



    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Number:");
        int number=sc.nextInt();


    }
}
