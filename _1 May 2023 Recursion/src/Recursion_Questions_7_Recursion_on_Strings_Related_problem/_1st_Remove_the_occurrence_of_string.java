package Recursion_Questions_7_Recursion_on_Strings_Related_problem;

import java.util.*;

public class _1st_Remove_the_occurrence_of_string {

    static void occurrenceOfString(String s1,int idx) {

        //Base case condition.
        if ( idx == s1.length()-1){

               if(s1.charAt(idx)!='a'){

                   System.out.print(""+s1.charAt(idx));
               }
               return;
        }

        // Self work
        if(s1.charAt(idx)!='a'){

            System.out.print(""+s1.charAt(idx));
        }

        // Recursive work or sub-problem
        occurrenceOfString(s1,idx+1);

    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String name:");
        String s1 =sc.nextLine();

        occurrenceOfString(s1,0);

    }
}
