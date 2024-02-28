package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _35_printRectangle_Sum_using_Pre_calculating_HorizontalSum_Mam_approach {

    static void printArray(int matrix[][]){

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){

                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }
    static int [][] prefixSum_calculation(int matrix[][]){

        int sum=0;

        // Traverse horizontally to calculate row wise prefixSum

        for (int i=0;i<matrix.length;i++){

            for(int j=1;j<matrix[i].length;j++){

                matrix[i][j]  +=matrix[i][j-1];
            }
        }

        return matrix;

    }

    static int find2Sum(int matrix[][],int l1,int r1,int l2,int r2){


        int sum=0;

        for(int i=l1;i<=l2;i++){

            if( r1 > 0){

                sum +=matrix[i][r2] -matrix[i][r1-1];

            } else {

                sum +=matrix[i][r2] ;
            }
        }
        return sum;

    }

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

        int matrix[][]=prefixSum_calculation(arr);

        System.out.println("Horizontally row wise prefixSum");
        printArray(matrix);

        System.out.print("Rectangle Sum is:");
        System.out.println(find2Sum(matrix,l1,r1,l2,r2));
    }
}
