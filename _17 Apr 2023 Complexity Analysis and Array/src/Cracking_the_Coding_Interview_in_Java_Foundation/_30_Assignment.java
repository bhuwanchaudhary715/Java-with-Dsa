/**
 *
 * Q2 - Given a square matrix, rotate it by 90 degrees in anti_clockwise direction. (Medium)
 *
 *
 * Input1:
 *         n=3
 *         m=3
 *         matrix = [[1,2,3],[4,5,6],[7,8,9]]
 *
 * Output1:
 *         3  6  9
 *
 *         2  5  8
 *
 *         1  4  7
 *
 *
 * Input2:
 *        n=2
 *        m=2
 *        matrix = [[1,2],[4,5]]
 *
 *
 * Output2:
 *         2  5
 *
 *         1  4
 *
 *
 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _30_Assignment {

    static int [][] transposeMatrix(int arr[][],int r,int c){

        for(int i=0;i<r;i++){

            for (int j=i+1;j<c;j++){

                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        return arr;
    }

    static void rotated_90Degree_anti_clockwise_direction(int arr[][],int r,int c){

        int transposeMatrix[][]=transposeMatrix(arr,r,c);

        for(int i=transposeMatrix.length-1; i>=0 ; i--){

            for(int j=0;j<transposeMatrix[i].length;j++){

               System.out.print(" "+transposeMatrix[i][j]);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of row-1 and Column-1:");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int arr[][]=new int[r][c];

        System.out.println("Enter the value of Matrix -1:");

        for(int i=0;i<r;i++){

            for(int j=0;j<c;j++){

                arr[i][j]=sc.nextInt();
            }
        }
        rotated_90Degree_anti_clockwise_direction(arr,r,c);

    }
}
