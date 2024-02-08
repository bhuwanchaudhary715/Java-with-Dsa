package Recursion_Based_problem_Cracking_the_Coding_Interview_in_Java_Foundation_Practice_Only;

import java.util.Scanner;

public class CountOfDigits {

    public static int COD(int n) {

        // Base case condition
        if( n==0 ) {

            return n ;
        }

        return COD(n/10) + 1;
    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of number:");
        int n=sc.nextInt();

        System.out.println("The number of count is:"+COD(n));


    }
}
