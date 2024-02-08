package Recursion_Questions_7_Recursion_on_Strings_Related_problem;

import java.util.Scanner;

public class _3rd_check_given_given_Palindrome_Lecture_approach {

    static boolean palindrome(String s1,int left,int right){

        // Base case condition.
        if( left == right){

            return true;
        }

        // Recursive work + Self work
        return ( ( s1.charAt(left)== s1.charAt(right)) && palindrome(s1,left+1,right-1) );
    }


    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String value:");
        String s1=sc.nextLine();

        System.out.println(palindrome(s1,0,s1.length()-1));
    }
}
