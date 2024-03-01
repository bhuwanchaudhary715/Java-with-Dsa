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

    // -->  prefixSum row_Wise direction
    static void prefixSum_in_rowWise_direction(int matrix[][]){

        for(int i=0;i<matrix.length;i++){

            for(int j=1;j<matrix[i].length;j++){

                matrix[i][j] +=matrix[i][j-1];
            }
        }
        System.out.println("prefixSum row wise direction");
        printArray(matrix);
    }


  // --> prefixSum over column and row both
    static void  prefixSum_Over_column_and_rowBoth(int matrix[][]){

        prefixSum_in_rowWise_direction(matrix);

        for(int i=1;i<matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){

                matrix[i][j] +=matrix[i-1][j];
            }
        }

        System.out.println("prefixSum over colum and row both");
        printArray(matrix);
    }

    static  int  find_Ans(int matrix[][],int l1,int r1,int l2,int r2){

        int sum=0, up=0,left=0,leftUp=0;
        prefixSum_Over_column_and_rowBoth(matrix);

            sum = matrix[l2][r2];

        if(l1 > 0) {
             up = matrix[l1 - 1][r2];
        }

        if(r1 > 0) {
             left = matrix[l2][r1 - 1];
        }

        if(l1 > 0 && r1 > 0) {

             leftUp = matrix[l1 - 1][r1 - 1];
        }


        int ans = sum - up - left + leftUp;

        return ans;

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

        System.out.println("Rectangle sum is:"+find_Ans(arr,l1,r1,l2,r2));

    }
}
