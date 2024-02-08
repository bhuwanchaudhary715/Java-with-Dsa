package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _29_Transpose_2D_Matrix {

    static void printArray(int arr[][]){

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }

    // Transpose inPlace
    static void transpose(int arr[][]){

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                System.out.print(" "+arr[j][i]);
            }

            System.out.println();
        }
    }

    // Transpose inPlace
    static void transpose_with_swapping(int arr[][]){

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr[i].length;j++){

                int temp=arr[j][i];
                arr[j][i]=arr[i][j];
                arr[i][j]=temp;
            }
        }
         printArray(arr);

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
        // transpose(arr);
        transpose_with_swapping(arr);

    }
}
