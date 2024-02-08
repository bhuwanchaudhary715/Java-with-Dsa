package Recursion_Based_problem_Cracking_the_Coding_Interview_in_Java_Foundation_Practice_Only;

import java.util.Scanner;

public class Long_Division_Approach_to_find_GCD {

    public static int GCD( int x,int y ){

        while ( x % y != 0){

           int rem = x % y;

              x = y;

              y=rem;
        }

        return y;
    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of X and Y:");
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println(GCD(x,y));


    }
}
