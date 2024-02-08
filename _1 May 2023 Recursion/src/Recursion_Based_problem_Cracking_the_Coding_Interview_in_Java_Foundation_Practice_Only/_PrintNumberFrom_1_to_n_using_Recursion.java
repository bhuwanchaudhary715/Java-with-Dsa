package Recursion_Based_problem_Cracking_the_Coding_Interview_in_Java_Foundation_Practice_Only;

import java.util.Scanner;

public class _PrintNumberFrom_1_to_n_using_Recursion {

    public static void printNumber(int number) {

        // Base case condition.
        if( number == 1 ){

            System.out.println(1);
            return ;
        }

           System.out.println(number);

          printNumber(number-1);  // Recursive Call


    }


    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Number:");
        int number=sc.nextInt();

      _PrintNumberFrom_1_to_n_using_Recursion.printNumber(number);





    }
}
