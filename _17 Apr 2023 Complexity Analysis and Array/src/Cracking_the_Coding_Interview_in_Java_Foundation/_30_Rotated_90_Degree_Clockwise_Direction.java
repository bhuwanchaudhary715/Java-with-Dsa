package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _30_Rotated_90_Degree_Clockwise_Direction {

    static void printArray(int arr[][]){

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }

    // Rotated Inplace without using any extra space.
    static void printClockwise_Direction(int arr[][],int r,int c){

        for (int i=0;i<c;i++){

            for(int j= r-1;j>=0;j--){

                System.out.print(" "+arr[j][i]);
            }

            System.out.println();
        }
    }

    /* Rotated Inplace
       1st step  --> Transpose the matrix .
       2nd step  --> Reverse the Array matrix .

     */

    static int[][]  _1st_step_Transpose_Matrix(int arr[][],int r,int c){

        for(int i=0;i<r;i++){

            for(int j=i+1;j<c;j++){

                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        return arr;
    }

    static void _2nd_step_Reverse_Array_Matrix(int arr[][],int r,int c){

        int transpose_matrix[][] = _1st_step_Transpose_Matrix(arr,r,c);

        // My own Written methods
      /*  for(int i=0;i<r;i++){

            for(int j=c-1;j>=0;j--){

                System.out.print(" "+transpose_matrix[i][j]);
            }
            System.out.println();
        }
        */

        // mam teaching method.
        for (int i=0;i<r;i++){
            int left=0;
            int right=c-1;

            while(left < right ){

                int temp =transpose_matrix[i][right];
                transpose_matrix[i][right]=transpose_matrix[i][left];
                transpose_matrix[i][left]=temp;
                left++;
                right--;
            }
        }
        printArray(transpose_matrix);
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

        System.out.println("90 degree rotated matrix is:");
       // printClockwise_Direction(arr,r,c);
        _2nd_step_Reverse_Array_Matrix(arr,r,c);
    }
}
