package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _31_print_Spiral_Matrix {

    static void printMatrix(int matrix[][]){

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){

                System.out.print(" "+matrix[i][j]);
            }

            System.out.println();
        }
    }

    static void printSpiralOrder(int matrix[][],int r,int c ){

        int topRow=0 ,bottomRow=r-1, leftCol=0, rightCol=c-1;
        int totalElements=0;

        while(totalElements < r*c){

            // topRow --> leftCol to rightCol
            for(int j=leftCol;j<=rightCol && totalElements<r*c ;j++){

                System.out.print(" "+matrix[topRow][j]);
                totalElements++;
            }
            topRow++;

            // rightCol --> topRow to bottomRow
             for (int i=topRow;i<=bottomRow && totalElements<r*c ;i++){

                 System.out.print(" "+matrix[i][rightCol]);
                 totalElements++;
             }
             rightCol--;

            // bottomRow --> rightCol to leftCol
            for (int j=rightCol;j>=leftCol && totalElements<r*c ;j--){

                System.out.print(" "+matrix[bottomRow][j]);
                totalElements++;
            }
            bottomRow--;

            // leftCol --> bottomRow to topRow
            for (int i=bottomRow;i>=topRow && totalElements<r*c ;i--){

                System.out.print(" "+matrix[i][leftCol]);
                totalElements++;
            }
            leftCol++;
        }
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

        System.out.println("Original matrix is:");
        printMatrix(arr);

        System.out.println("Spiral Matrix is :");
        printSpiralOrder(arr,r,c);


    }
}
