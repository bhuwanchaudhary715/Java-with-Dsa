package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _36_PrefixSumOverColumnAndRowBoth_DoneBYMyself {

    static void printArray(int matrix[][]){

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){

                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }
    static void prefixSum_in_rowWise_direction(int matrix[][]){

        for(int i=0;i<matrix.length;i++){

            for(int j=1;j<matrix[i].length;j++){

                matrix[i][j] +=matrix[i][j-1];
            }
        }
        System.out.println("row wise");
        printArray(matrix);
    }

    static int [][] prefixSum_in_columnWise_direction(int matrix[][]){

        prefixSum_in_rowWise_direction(matrix);

        for(int i=1;i<matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){

                matrix[i][j] +=matrix[i-1][j];
            }
        }
        return matrix;
    }

      Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of row and column:");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int arr[][]=new int[r][c];

        System.out.println("Enter the value of Matrix Elements:");
        for(int i=0;i< arr.length;i++){

            for(int j=0;j<arr.length;j++){

                arr[i][j]=sc.nextInt();

            }
        }
        System.out.println("Enter the value of l1 and r1:");
        int l1=sc.nextInt();
        int r1=sc.nextInt();

        System.out.println("Enter the value of l2 and r2:");
        int l2=sc.nextInt();
        int r2=sc.nextInt();

        int matrix[][]=prefixSum_in_columnWise_direction(arr);

        System.out.println("column wise");
        printArray(matrix);

    }
}
