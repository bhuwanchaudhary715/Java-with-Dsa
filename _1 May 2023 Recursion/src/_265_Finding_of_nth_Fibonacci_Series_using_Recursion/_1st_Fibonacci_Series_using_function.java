package _265_Finding_of_nth_Fibonacci_Series_using_Recursion;

import java.util.Scanner;

class FibonacciSeries{

    public static int findingFibonacci(int number){

        int result=0;

        if( number==0 ){

            return 0;

        }else if( number==1 ) {

            return 1;

        }else {

            result=findingFibonacci(number-1)+findingFibonacci(number-2);
        }

        return result;
    }
}

public class _1st_Fibonacci_Series_using_function {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Number");
        int number=sc.nextByte();

        int result=FibonacciSeries.findingFibonacci(number);



        System.out.println("The Fibonacci number is:"+result);
    }
}
