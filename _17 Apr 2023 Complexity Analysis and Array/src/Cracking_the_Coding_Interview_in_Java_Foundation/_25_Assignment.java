/**
 *
 * Q2. Convert a 1D sorted array of length n*m to a 2D array of n rows and m columns. The matrix
 * should also be sorted.[ Easy ]
 *
 * Input1:
 *        n = 2
 *        m = 2
 *        arr = [1,2,3,4]
 * Output1:
 *        [[1,2],[3,4]]
 *
 *
 * Input2:
 *        n = 1
 *        m = 3
 *        arr = [1,2,3]
 * Output2:
 *        [[1,2,3]]
 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _25_Assignment {

    static void printArray(int _2D[][],int r,int c){

        for(int i=0;i<r;i++){

            for(int j=0;j<c;j++){

                System.out.print(" "+_2D[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] convert_1D_Array_to_2D_Array(int _1D[],int r,int c){

        int _2D[][]=new int[r][c];

        int idx=0;

        for(int i=0;i<r;i++){

            for(int j=0;j<c;j++){

                _2D[i][j]=_1D[idx++];

            }
        }
        return _2D;
    }

    public static void main(String[] args) {


          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of row and column:");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int _1D[]=new int[r*c];

        System.out.println("Enter the value of Matrix elements:");
        for(int i=0;i<_1D.length;i++){

            _1D[i]=sc.nextInt();

        }

       int _2D[][] = convert_1D_Array_to_2D_Array(_1D,r,c);

        printArray(_2D,r,c);


    }
}
