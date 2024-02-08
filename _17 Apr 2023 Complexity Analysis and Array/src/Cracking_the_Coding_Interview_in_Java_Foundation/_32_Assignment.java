/**
 *
 * Q4 - Given a n*m matrix, return an array of elements containing diagonal traversal of the matrix.
 *
 *
 * Input1: n = 3
 *         m = 3
 *         arr[]=[[1, 2, 3],[4, 5, 6],[7, 8, 9]
 *
 * Output1:
 *
 * Input2: n = 1
 *         m = 3
 *         arr[]=[[1,2,3]]
 *
 * Output2:
 *         [1,2,3]
 *
 */



package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _32_Assignment {

    static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(" " + arr[i]);
        }
    }

    public static int [] findDiagonalOrder(int arr[][]){

        int m= arr.length;
        int n=arr[0].length;

        int row=0;
        int col=0;

        int ans[]=new int[n*m];

        int idx=0;
        boolean up=true;

        while(row < m && col < n ){

            if( up == true ){

                //   -->  Up
                while( row > 0 && col < n-1 ){

                    ans[idx++] =arr[row][col];
                    row--;
                    col++;
                }

                ans[idx++]=arr[row][col];

                if( col == n-1){

                    row++;
                } else {

                    col++;
                }


            }else{
                    //  --> Down
                while( row < m-1 && col > 0 ){

                    ans[idx++] =arr[row][col];
                    row++;
                    col--;
                }

                ans[idx++]=arr[row][col];

                if( row == m-1){

                    col++;
                } else {

                    row++;
                }
            }

            up= !up;
        }
        return ans;
    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of row-1 and Column-1:");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int arr[][]=new int[r][c];

        System.out.println("Enter the value of Matrix -1:");

        for(int i=0;i<r;i++){

            for(int j=0;j<c;j++){

                arr[i][j]=sc.nextInt();
            }
        }

        int ans[]= findDiagonalOrder(arr);
        System.out.println("The Traversal of the matrix is");
        printArray(ans);
    }
}
