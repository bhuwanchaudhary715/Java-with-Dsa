/**
 *
 * Q1. Check if an element x exists in the given matrix or not. If it does not exist, return -1, else return its
 *  row and column index. [ Easy ]
 *
 *  Input1:
 *          n = 3
 *          m = 3
 *          x = 12
 *          arr[][] = {{3, 8, 0}, {6, 3, 2}, {12, 9, 10}}
 * Output1:
 *         Row = 2
 *         Column = 0
 *
 *
 * input2:
 *        n = 1
 *        m = 2
 *        x = 2
 *        arr[][] = {{4, 5}}
 * Output2:
 *         -1
 */
package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _24_Assignment {

    static void checkArrayElements_exist_orNot(int arr[][],int x,int r,int c){

        int num=0;
        for (int i=0;i<r;i++){

            for (int j=0;j<c;j++){

                if(arr[i][j] == x){

                    System.out.println("Row="+i+",Column="+j);
                    num=1;
                    break;
                }
            }
        }

        if(num ==0){

            System.out.println(-1);
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

        System.out.println("Enter the value of X:");
        int x=sc.nextInt();

        checkArrayElements_exist_orNot(arr,x,r,c);
    }
}
