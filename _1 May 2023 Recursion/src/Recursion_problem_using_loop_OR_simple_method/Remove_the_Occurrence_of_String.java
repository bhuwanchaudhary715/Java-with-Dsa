package Recursion_problem_using_loop_OR_simple_method;

import java.util.*;

public class Remove_the_Occurrence_of_String {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of String name:");
        String s1=sc.nextLine();



        String ans="";

        for(int i=0; i<s1.length();i++){       // s1="bhuwan"  s2="Chaudhary"
                                               //        s=s1+s2
            if( s1.charAt(i)!='a'){            // s="bhuwanchaudhary"

                ans+=s1.charAt(i);
            }
        }

        System.out.println(ans);

    }
}
