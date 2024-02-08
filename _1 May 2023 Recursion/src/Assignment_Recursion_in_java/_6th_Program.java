
/*
Q1. Write a program to merge 2 strings alternately using recursion starting from the first input string.

   Input-1:
           abcd
           efgh
   Output-1:
           aebfcgdh


   Input-2:
          abet
          po
   Output-2:
          apboet

 */

package Assignment_Recursion_in_java;

import java.util.Scanner;

public class _6th_Program {

    static String mergeTwoString( String s1,String s2,int idx1,int idx2){

        // Base case condition.
        if( idx1 < 0 || idx2 < 0  ){

            return "";
        }

       return mergeTwoString(s1,s2,idx1-1,idx2-1)+ s1.charAt(idx1)+s2.charAt(idx2);

    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String s1 and s2:");
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        System.out.println(mergeTwoString(s1,s2,s1.length()-1,s2.length()-1));




    }
}
