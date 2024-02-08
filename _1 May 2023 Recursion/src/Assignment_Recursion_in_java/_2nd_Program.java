
/*
       Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.

           That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.

           Constraints : 0<=n<=1e6

      Input1 : n = 10
      Output 1 : -5

      Explanation : 1-2+3-4+5-6+7-8+9-10 = -5

      Input 2 : n = 5
      Output 2 : 3

 */

package Assignment_Recursion_in_java;

import java.util.Scanner;

public class _2nd_Program {

    public static int sumOfNaturalNumWithAlternateSign(int number){

        if( number == 0){

            return number;
        }

        else if( number % 2 == 0){

            return sumOfNaturalNumWithAlternateSign(number-1) - number;  //  <-- case: if the number is Even.

        } else {

            return sumOfNaturalNumWithAlternateSign(number-1) + number;  //  <-- case: if the number is odd.

        }
    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Entre the value of Number:");
        int number=sc.nextInt();

        int result = _2nd_Program.sumOfNaturalNumWithAlternateSign(number);

        System.out.println("Output:"+result);

    }
}
