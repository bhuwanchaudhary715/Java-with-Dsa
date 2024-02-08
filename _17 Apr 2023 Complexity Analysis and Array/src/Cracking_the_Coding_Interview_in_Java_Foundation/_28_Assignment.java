package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _28_Assignment {

    static void checkElement_in_2D_Matrix(int arr[][],int r,int c,int x){

        for(int i=0;i<r;i++){

            for(int j=0;j<c;j++){

               if(arr[i][j]==x){

                   System.out.print(" Row ="+i);
                   System.out.print(" Column ="+j);
                   return;
               }
            }
        }

        System.out.println(-1);
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

        checkElement_in_2D_Matrix(arr,r,c,x);
    }
}
