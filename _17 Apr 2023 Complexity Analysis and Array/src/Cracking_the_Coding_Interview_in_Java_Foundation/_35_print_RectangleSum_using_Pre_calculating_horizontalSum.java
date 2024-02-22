package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _35_print_RectangleSum_using_Pre_calculating_horizontalSum {

    static void printPrefixSumMatrix(int matrix[][] ){

        // This

        int r=matrix.length;
        int c=matrix[0].length;

        // traverse horizontally to calculate row-wise prefixSum

        for(int i=0;i<r;i++){

            for(int j=1;j<c;j++){

                matrix[i][j]  = matrix[i][j] + matrix[i][j-1];
            }
        }
    }

    static int findSum(int matrix[][],int l1,int r1,int l2,int r2){

        int sum=0;

        printPrefixSumMatrix(matrix);

        for(int i=l1;i<=l2;i++){

           if( r1 > 0 ){

               sum += matrix[i][r2] - matrix[i][r1-1];

           } else {

               sum += matrix[i][r2];
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

        System.out.println(findSum(arr,l1,r1,l2,r2));
    }
}
