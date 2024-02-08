package _266_Finding_of_Power_using_Recursion;

import java.util.Scanner;

 class FindingPower{

      // Function definition
     public static long powerFinding(long a, long b){

         long  mid=0, result=0, finalResult=0;


         if( b==1){     // Base case condition

             return a;

         }else {

             mid=b/2;
             result=powerFinding(a,mid);   // recursive call

             finalResult=result*result;

             if(b % 2 ==0){

                 return finalResult;

             }else {

                 return a*finalResult;
             }
         }
     }
 }

public class _2nd_Power_program_using_Efficient_approach {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of A:");
        long a=sc.nextInt();

        System.out.println("Enter the value of B:");
        long b=sc.nextLong();

        long result=FindingPower.powerFinding(a,b);

        System.out.println("Power of A^b is:"+result);

    }
}
