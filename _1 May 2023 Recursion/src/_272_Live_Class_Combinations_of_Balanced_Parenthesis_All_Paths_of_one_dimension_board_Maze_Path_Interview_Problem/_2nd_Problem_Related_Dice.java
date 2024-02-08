

package _272_Live_Class_Combinations_of_Balanced_Parenthesis_All_Paths_of_one_dimension_board_Maze_Path_Interview_Problem;

import java.util.Scanner;

public class _2nd_Problem_Related_Dice {

    // Function definition.
    public static void printPath(int current, int destination, String ans){


        if( current > destination ){     // -ve Base case condition when current go to out of boundary .

            return;
        }


        if( current == destination ){   //  +ve Base case Condition simply return print the answer.

            System.out.println(ans);
            return;
        }

        printPath(current+1,destination,ans+1);
        printPath(current+2,destination,ans+2);
        printPath(current+3,destination,ans+3);
        printPath(current+4,destination,ans+4);
        printPath(current+5,destination,ans+5);
        printPath(current+6,destination,ans+6);

    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Current number and destination number:");
        int current = sc.nextInt();
        int destination = sc.nextInt();
        String ans = "";

        _2nd_Problem_Related_Dice.printPath(current,destination,ans);


    }
}
