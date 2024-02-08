package Recursion_Based_problem_Cracking_the_Coding_Interview_in_Java_Foundation_Practice_Only;

import java.util.Scanner;

public class Euclid_Algorithm_Method_to_find_GCD_using_Recursion {

    public static int euclidGCD(int x,int y){

        // Base case condition.
        if( y == 0)  return x;

        // recursive call
        return euclidGCD(y,x%y);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of X and Y:");
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println(euclidGCD(x,y));



    }
}
