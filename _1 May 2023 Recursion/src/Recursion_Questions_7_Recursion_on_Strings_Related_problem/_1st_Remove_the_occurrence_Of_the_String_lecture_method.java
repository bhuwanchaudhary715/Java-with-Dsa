package Recursion_Questions_7_Recursion_on_Strings_Related_problem;

import java.util.*;

public class _1st_Remove_the_occurrence_Of_the_String_lecture_method {

    static String removeOccurrence(String s1,int idx){

        //Base case
        if( idx == s1.length()) return "";

        // Recursive work or sub_problem
        String smallAns= removeOccurrence(s1,idx+1);

        // Self work
        char currentChar=s1.charAt(idx);

        if( currentChar != 'a') {

            return currentChar + smallAns;

        }else {

            return smallAns;
        }
    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String value:");
        String s1 =sc.nextLine();

        System.out.println(removeOccurrence(s1,0));


    }
}
