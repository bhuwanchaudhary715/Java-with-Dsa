package _282_Examples_Of_Backtracking;

import java.util.*;

public class _1st_Example_program {

    static int tileProblem( int n ){

        // Base case condition
        if( n <= 3){

            return n;
        }

        // Recursive call or sub-problem

        return tileProblem(n-1) + tileProblem(n-2);
    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of N:");
        int n=sc.nextInt();

        System.out.println("For n=" +n+ " total Ways= "+tileProblem(n));



    }
}
