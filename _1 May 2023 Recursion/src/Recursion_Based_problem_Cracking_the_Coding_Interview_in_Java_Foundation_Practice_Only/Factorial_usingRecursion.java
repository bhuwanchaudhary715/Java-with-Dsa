package Recursion_Based_problem_Cracking_the_Coding_Interview_in_Java_Foundation_Practice_Only;

public class Factorial_usingRecursion {

    public static int factorial(int n){   // <-- function definition


        if( n == 0 ) return 1;   // <-- Base case or terminate case



        int smallAns = factorial(n-1);  //  <-- Recursive work or Recursive Call

        int ans = n*smallAns; //  <-- Self work

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(factorial(4));  //  <-- function call
    }
}
