/**
 *
 *Q1 - Given two integer matrices, multiply the matrices, if possible, else return “Invalid Input”.
 *                    (Medium)
 * Input1:
 *      n1 = 2
 *  *   m1 = 3
 *  *
 *  *   arr1 = {{2,4,1}, {3,5,6}}
 *  *
 *  *   n2 = 3
 *  *   m2 = 2
 *  *
 *  *   arr2 = {{1,2}, {3,4}, {5,7}}
 *  *
 * Output1:
 *        19 27
 *
 *        48 68
 *
 * Input1:
 *        n1 = 3
 *  *     m1 = 2
 *  *
 *  *
 *  *     n2 = 3
 *  *     m2 = 2
 *  *
 *  *
 *  *    mat1 = {{1, 2}, {3, 4}, {1, 2}}
 *  *    mat2 = {{2, 3}, {4, 5}, {6, 7} }
 *
 * Output2:
 *         -1
 *
 */


package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _29_Assignment {

    static void printArray(int arr[][],int r1,int c2){

        for(int i=0;i<r1;i++){

            for(int j=0;j<c2;j++){

                System.out.print(" "+arr[i][j]);

            }
            System.out.println();
        }
    }

    static void multiply(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2){

        if( c1 != r2 ) {

            System.out.println(" Invalid input - Wrong input :");
            return;
        }

        int mul[][]=new int[r1][c2];

        for(int i=0;i<r1;i++){

            for(int j=0;j<c2;j++){

                for(int k=0;k<c1;k++){

                    mul[i][j] +=arr1[i][k] * arr2[k][j];

                }
            }
        }

         printArray(mul,r1,c2);
    }



    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of row-1 and column-1:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();

        int arr1[][]=new int[r1][c1];

        System.out.println("Enter the elements Matrix-1");
        for(int i=0;i<r1;i++){

            for(int j=0;j<c1;j++){

                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the size of row-2 and column-2:");
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int arr2[][]=new int[r2][c2];

        System.out.println("Enter the elements Matrix-2");
        for(int i=0;i<r2;i++){

            for(int j=0;j<c2;j++){

                arr2[i][j]=sc.nextInt();
            }
        }

        multiply(arr1,r1,c1,arr2,r2,c2);


    }
}
