package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _34_print_RectangleSum_using_bruteForce_Approach {

    static void printMatrix(int matrix[][]){

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){

                System.out.print(" "+matrix[i][j]);
            }

            System.out.println();
        }
    }

    static void print_rectangleSum_bruteForceApproach(int arr[][],int l1,int r1,int l2,int r2){

        int sum=0;
        for(int i=l1;i<=l2;i++){

            for(int j=r1;j<=r2;j++){

                sum +=arr[i][j];
            }
        }

        System.out.println("The Sum is:"+sum);
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


        print_rectangleSum_bruteForceApproach(arr,l1,r1,l2,r2);
    }
}
