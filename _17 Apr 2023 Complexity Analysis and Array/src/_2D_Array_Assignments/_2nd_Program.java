
/*
Q2: write a program to print the elements above the secondary diagonal in a user inputted           (Medium)
square matrix.

Input:
          1 2 3
          4 5 6
          7 8 9

Primary --> 1 5 9
Diagonal

Secondary --> 3 5 7
Diagonal

Output: 1 2 4

 */


package _2D_Array_Assignments;

import java.util.Scanner;

public class _2nd_Program {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);
                                                                                 // Time Complexity = O(n*n)
        System.out.println("Enter the Size of Row And Column:");                // Space Complexity= O(1)
        int m=sc.nextInt();
        int n=sc.nextInt();

        int array[][]=new int[m][n];

        System.out.println("Enter the Matrix elements:");
        for(int i=0;i<array.length;i++){       // -->  Row

            for(int j=0;j<array.length;j++){  // --> Column

                array[i][j]=sc.nextInt();
            }
        }

        for(int i = 0; i < args.length-1; i++) {       // -->  Row

            for (int j = 0; j < array.length-1; j++) {  // --> Column

                if( i==0 || j==0  ){

                    System.out.print(" "+array[i][j]);

                }
            }
            System.out.print(" ");
        }
    }
}
