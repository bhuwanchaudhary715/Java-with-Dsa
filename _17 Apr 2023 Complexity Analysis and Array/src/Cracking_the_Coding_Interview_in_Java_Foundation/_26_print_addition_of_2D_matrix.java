package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _26_print_addition_of_2D_matrix {

    public static void printArray(int arr[][]){

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void additionOf_2D_Matrix(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2){

        if( r1 != c1 || r2 != c2){

            System.out.println("Addition is not possible:");

            return;
        }

        int sum[][]=new int[r1][c1];

        for (int i=0;i<r1;i++){

            for(int j=0;j<c1;j++){

                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        System.out.println("The Sum of arr-1 and arr-2 is :");
        printArray(sum);
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

        for(int i=0;i<r1;i++){

            for(int j=0;j<c1;j++){

                arr2[i][j]=sc.nextInt();
            }
        }

        additionOf_2D_Matrix(arr1,r1,c1,arr2,r2,c2);
    }
}
