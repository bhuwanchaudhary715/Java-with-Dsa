package Recursion_Based_problem_Cracking_the_Coding_Interview_in_Java_Foundation_Practice_Only;

public class Fibonacci_series_Using_Function {

    public static int Fibonacci(int n){

        if( n == 0 || n == 1){   //  <-- Base case condition

            return n;
        }

        int previous=Fibonacci(n-1); //  <-- self work or recursive call
        int nextPrevious= Fibonacci(n-2); //  <-- self work or recursive call

        return previous+nextPrevious;
    }

    public static void main(String[] args) {

        int n=8;

        for(int i=0;i<=n;i++){

            System.out.print(" "+Fibonacci_series_Using_Function.Fibonacci(i));  // <-- function calls

        }
    }
}
