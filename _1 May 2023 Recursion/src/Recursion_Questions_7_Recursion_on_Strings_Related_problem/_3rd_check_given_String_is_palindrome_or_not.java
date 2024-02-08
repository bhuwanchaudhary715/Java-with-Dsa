package Recursion_Questions_7_Recursion_on_Strings_Related_problem;

import java.util.Scanner;

public class _3rd_check_given_String_is_palindrome_or_not {

    static String palindrome(String s1,int idx){

        // Base case
        if( idx == s1.length()){


            return "";
        }

        return palindrome(s1,idx+1)+s1.charAt(idx);

    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String value:");
        String s1=sc.nextLine();

        String result=palindrome(s1,0);

        if( s1.equals(result)){

            System.out.println("Given String is a palindrome string");

        }else {

            System.out.println("Given String is not a palindrome string");
        }


    }
}
