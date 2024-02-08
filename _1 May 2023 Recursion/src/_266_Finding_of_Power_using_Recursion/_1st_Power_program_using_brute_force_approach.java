package _266_Finding_of_Power_using_Recursion;

import java.util.Scanner;

 class Power{

     public static long findingOfPower(int a,int b){

        long result=0;
         if( b==0){

             return 1;

         } else {

             result=a*findingOfPower(a,b-1);

         }
         return result;
     }
 }

public class _1st_Power_program_using_brute_force_approach {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of A:");
        int a=sc.nextInt();

        System.out.println("Enter the value of B:");
        int b=sc.nextInt();

       long result=Power.findingOfPower(a,b);

        System.out.println("The power of a^b is:"+result);


    }
}
