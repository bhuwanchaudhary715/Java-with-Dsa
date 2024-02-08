/*

 Q5. Write a function accepts a 2D array of Integer and its Size as arguments and
     displays the elements of Middle row and the elements of Middle column. Printing
     can be done in any order.

     [ Assuming the 2d array to be a Square matrix with odd dimensions i.e 3*3, 5*5, 7*7 etc..]

     Input 1:
             1 2 3 4 5
             3 4 5 6 7
             7 6 5 4 3
             8 7 6 5 4
             1 2 37 8 0

     Output: 3 5 5 6 37 7 6 4 3
 */


package _2D_Array_Assignments;

import java.util.Scanner;

class SquareMatrix{

    public static void printMatrix(int array[][],int m,int n){

        for (int i=0;i< m;i++){

            for(int j=0;j< n;j++){

                if( i==(n-1)/2 || j==(n-1)/2){

                    System.out.print(" "+array[i][j]);
                }
            }
            System.out.print(" ");
        }
    }
}

public class _5th_program {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Row:");
        int m=sc.nextInt();

        System.out.println("Enter the size of Column:");
        int n=sc.nextInt();

        int array[][]=new int[m][n];

        System.out.println("Enter the Elements of matrix:");
        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){

                array[i][j]=sc.nextInt();
            }
        }

        SquareMatrix.printMatrix(array,m,n);


    }
}
