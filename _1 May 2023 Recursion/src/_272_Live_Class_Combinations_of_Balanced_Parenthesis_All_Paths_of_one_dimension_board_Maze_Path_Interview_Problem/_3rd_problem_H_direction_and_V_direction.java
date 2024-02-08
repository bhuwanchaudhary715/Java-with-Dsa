package _272_Live_Class_Combinations_of_Balanced_Parenthesis_All_Paths_of_one_dimension_board_Maze_Path_Interview_Problem;

import java.util.Scanner;

public class _3rd_problem_H_direction_and_V_direction {

    // function definition.
    public static void printMaze(int Cr, int Cc, int Dr, int Dc, String ans){

        //  -ve Base case condition.
        if( Cc > Dc || Cr >Dr){

            return;
        }

        //  +ve Base case condition.
        if( Cc == Dc && Cr == Dr){

            System.out.println(ans);
            return;
        }

        printMaze(Cr,Cc+1,Dr,Dc,ans+ "H");   // Recursive call
        printMaze(Cr+1,Cc,Dr,Dc,ans+ "V");   // Recursive call
    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Current row and Current column:");
        int Cr=sc.nextInt();
        int Cc=sc.nextInt();

        System.out.println("Enter the value of Destination row and Destination column:");
        int Dr=sc.nextInt();
        int Dc=sc.nextInt();

        String ans = "";

        _3rd_problem_H_direction_and_V_direction.printMaze(Cr,Cc,Dr,Dc,ans);


    }
}
