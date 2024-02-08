package Recursion_Based_problem_Cracking_the_Coding_Interview_in_Java_Foundation_Practice_Only;

import java.util.Scanner;

public class Print_sum_of_Given_All_digits {

    public static int sumOfDigits(int n){   //  <-- Function definition.

        if( n == 0 ){   // <-- Base case

            return n;
        }

        int p1=sumOfDigits(n/10);   // <-- Recursive call

        int p2=n%10;    //  <-- Self work

        return p1+p2;
    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Number:");
        int n=sc.nextInt();

        int result = sumOfDigits(n);
        System.out.println("The sum of "+n+" digits:"+result);


    }
}
