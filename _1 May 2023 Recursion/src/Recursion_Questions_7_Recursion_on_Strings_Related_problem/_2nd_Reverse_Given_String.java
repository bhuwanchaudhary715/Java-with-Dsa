package Recursion_Questions_7_Recursion_on_Strings_Related_problem;

import java.util.Scanner;

public class _2nd_Reverse_Given_String {

    static String reverseString( String s1,int idx){

        // Base case condition.
        if( idx < 0){

            return "";
        }

       String smallAns = reverseString(s1,idx-1) ;

        return s1.charAt(idx)+smallAns;

    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String value:");
        String s1=sc.nextLine();

        System.out.println(reverseString(s1,0));


    }
}
