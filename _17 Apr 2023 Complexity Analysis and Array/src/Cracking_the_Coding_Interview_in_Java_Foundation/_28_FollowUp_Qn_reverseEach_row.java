package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _28_FollowUp_Qn_reverseEach_row {

    static void reverseEachArray(int arr[][],int r,int c){

        for (int i=0;i<r;i++){

            for(int j= c-1;j>=0;j--){

                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
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

        reverseEachArray(arr,r,c);
    }
}
