

package _272_Live_Class_Combinations_of_Balanced_Parenthesis_All_Paths_of_one_dimension_board_Maze_Path_Interview_Problem;

import Assignment_Recursion_in_java._1st_Program;

import java.util.Scanner;

public class _1st_Problem {

    public static void printCombination(int number, int oc, int cc, String ans){

        if ( oc == number && cc == number){

            System.out.println(ans);
            return;
        }

        // 1st Condition .
        if( oc < number){

            printCombination(number,oc+1, cc, ans+"(");  // oc <-- open count bracket,  cc <-- close count bracket
                  // Recursive calls
        }


        // 2nd condition .
        if(oc > cc){

            printCombination(number, oc,cc+1,ans+")");
             // Recursive calls
        }
    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Number of combination pairs:");
        int number=sc.nextInt();

        System.out.println("Enter the value of OC open count bracket:");
        int oc=sc.nextInt();

        System.out.println("Enter the value of CC closed count bracket:");
        int cc=sc.nextInt();

        String ans ="";

       _1st_Problem.printCombination(number,oc,cc,ans);

    }
}
