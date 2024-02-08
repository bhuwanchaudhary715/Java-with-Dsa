package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _27_Print_Multiplication_of_2D_Matrix {

    static void printArray(int arr[][]){

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    static void multiply(int a[][],int r1,int c1,int b[][],int r2,int c2){

        if( c1 != r2){

            System.out.println("Multiplication is not possible: invalid dimension");
            return;
        }

        int mul[][]=new int[r1][c2];

        for (int i=0;i<r1;i++){  // row number

            for(int j=0;j<c2;j++){  // column number

                for (int k=0; k<c1;k++){

                  mul[i][j]   += a[i][k] * b[k][j];

                }
            }
        }

        System.out.println("Multiplication arr1 and arr2 are:");
        printArray(mul);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of row-1 and Column-1:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();

        int arr1[][]=new int[r1][c1];

        System.out.println("Enter the value of Matrix -1:");

        for(int i=0;i<r1;i++){

            for(int j=0;j<c1;j++){

                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the size of row-2 and Column-2:");
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int arr2[][]=new int[r2][c2];

        System.out.println("Enter the value of Matrix -2:");

        for(int i=0;i<r2;i++){

            for(int j=0;j<c2;j++){

                arr2[i][j]=sc.nextInt();
            }
        }

        multiply(arr1,r1,c1,arr2,r2,c2);
    }
}
