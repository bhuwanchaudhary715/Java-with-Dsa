package _263_Introduction_to_Recursion;

import java.util.Scanner;

 class Factorial{

     public static int factorialNumber(int number){


          int result=0;
         if(number==0 || number==1){

             return 1;        // base case Condition.

         }else {

             result= number*factorialNumber(number-1);   // recursive call Condition.

         }
         return result;
     }
 }

public class _1st_Demo_of_factorial_Using_function {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Number:");
        int number=sc.nextInt();

        int result=Factorial.factorialNumber(number);

        System.out.println("The factorial of "+number+" is:"+result);

    }
}
