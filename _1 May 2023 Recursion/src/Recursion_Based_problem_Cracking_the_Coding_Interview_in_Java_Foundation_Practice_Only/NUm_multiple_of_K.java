package Recursion_Based_problem_Cracking_the_Coding_Interview_in_Java_Foundation_Practice_Only;

import java.util.Scanner;

public class NUm_multiple_of_K {

    public static void nOK(int n,int k){

        // Base case condition.
//        if( k== 1){
//
//            System.out.println(n);
//            return ;
//        }

        // or we can write.

        if( k==0) return;

         nOK(n,k-1) ;  // <-- Recursive call.
        System.out.println(n*k);  // <--- self work.
    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n and k:");
        int n=sc.nextInt();
        int k=sc.nextInt();

        nOK(n,k);




    }
}
