package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _31_Pascal_triangle {

    static void printArray(int arr[][]){

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] print_pascalTriangle(int n){

        int ans[][]=new int[n][];

        for(int i=0;i<n;i++){

            // ith row has (i+1) column.
            ans[i]=new int[i+1];

            // 1st and last elements of every row
            ans[i][0]=ans[i][i]=1;

            for(int j=1;j<i;j++){

                ans[i][j]=ans[i-1][j] +ans[i-1][j-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        int ans[][]=print_pascalTriangle(n);

        printArray(ans);

    }
}
