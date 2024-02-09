package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _32_Generate_n_multiply_n_matrix {

    static void printMatrix(int matrix[][]){

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){

                System.out.print(" "+matrix[i][j]);
            }

            System.out.println();
        }
    }

    static void generateSpiralOrder(int n){

        int matrix[][]=new int[n][n];

        int topRow=0 ,bottomRow=n-1, leftCol=0, rightCol=n-1;
        int totalElements=0;

        int num=1;
        while(totalElements < n*n){


            // topRow --> leftCol to rightCol
            for(int j=leftCol;j<=rightCol && totalElements<n*n ;j++){

                matrix[topRow][j]=num++;
                totalElements++;
            }
            topRow++;

            // rightCol --> topRow to bottomRow
            for (int i=topRow;i<=bottomRow && totalElements<n*n ;i++){

                matrix[i][rightCol]=num++;
                totalElements++;
            }
            rightCol--;

            // bottomRow --> rightCol to leftCol
            for (int j=rightCol;j>=leftCol && totalElements<n*n ;j--){

                matrix[bottomRow][j]=num++;
                totalElements++;
            }
            bottomRow--;

            // leftCol --> bottomRow to topRow
            for (int i=bottomRow;i>=topRow && totalElements<n*n ;i--){

                matrix[i][leftCol]=num++;
                totalElements++;
            }
            leftCol++;
        }
        printMatrix(matrix);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of n:");
        int n=sc.nextInt();

        System.out.println(" generates of Spiral order is :");
        generateSpiralOrder(n);

    }
}
