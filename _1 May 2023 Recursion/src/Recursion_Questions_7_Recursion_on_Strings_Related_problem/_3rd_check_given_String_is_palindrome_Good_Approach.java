package Recursion_Questions_7_Recursion_on_Strings_Related_problem;

import java.util.Scanner;

public class _3rd_check_given_String_is_palindrome_Good_Approach {

    static void palindromeString( String s1,int left,int right){

        // Base case condition.
        if( left == right){

            return;
        }

        // self work

        if( s1.charAt(left) == s1.charAt(right)){

            System.out.println("Given number is a palindrome");
          return;
        }

        if( s1.charAt(left) != s1.charAt(right)){

            System.out.println("Given String is not palindrome:");
            return;
        }

        // recursive work

        palindromeString(s1,left+1,right-1);

    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String value:");
        String s1 = sc.nextLine();

        palindromeString(s1,0,s1.length()-1);

    }
}
