/**
 *
 * Q4. Given a 2D array for n rows and m columns, reverse each row. [ Medium]
 *
 * Input1:
 *       n = 3
 *       m = 3
 *       arr[][] = { {1, 2, 3},
 *                   {6, 7, 8},
 *                   {9, 10, 11} }
 * Output1:
 *       { {3, 2, 1},
 *         {8, 7, 6},
 *         {11, 10, 9} }
 * Input2:
 *        n = 3
 *        m = 3
 *       arr[][] = { {1, 2, 3},
 *                  {6, 7, 8},
 *                  {9, 10, 11} }
 * Output2:
 *         { {3, 2, 1},
 *           {8, 7, 6},
 *           {11, 10, 9} }
 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _27_Assignment {

    static void reverse_each_row(int arr[][],int r,int c){

        for(int i=0;i<r;i++){

            for(int j=c-1;j>=0;j--){

                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value size row and column:");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int arr[][]=new int[r][c];

        System.out.println("Enter the matrix elements:");
        for(int i=0;i<r;i++){

            for(int j=0;j<c;j++){

                arr[i][j]=sc.nextInt();
            }
        }
        reverse_each_row(arr,r,c);
    }
}
