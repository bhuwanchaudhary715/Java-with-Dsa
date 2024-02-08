/*
 Q3: write a program to print the elements of both the diagonals in a user inputted square matrix    (Medium)
 in any order.

Input 1:
          1 2 3
          4 5 6
          7 8 9

Primary --> 1 5 9
Diagonal

Secondary --> 3 5 7
Diagonal

Output 1: 1 3 5 7  9
 */

package _2D_Array_Assignments;

import java.util.Scanner;

public class _3rd_program {

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

        for(int i=0; i < m; i++){

            for(int j=0; j<n; j++){

                if( i==j || i+j==n-1){

                    System.out.print(" "+array[i][j]);
                }
            }
            System.out.print(" ");
        }

    }
}
