/**
 *
 * Q3. Given a 2D array of n rows and m columns, return the sum of elements along the range of row
 * and column specified.
 * Input1:
 *        n = 3
 *        m = 3
 *        arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
 *        range = [0, 1], [1, 2]
 * Output1:
 *        16
 *
 * Input2:
 *        n = 2
 *        m = 2
 *        arr[][] = {{3, 6}, {2,5}}
 *        range = [0, 0], [1, 1]
 * Output2:
 *        6
 *
 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _26_Assignment {

    static int  sum_Of_Element(int arr[][],int Sr,int Er,int Sc,int Ec){

        int sum=0;
        for(int i=Sr;i<=Er;i++){

            for(int j=Sc;j<=Ec;j++){

                sum +=arr[i][j];


            }
        }
        return sum;
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

        System.out.println("Enter the range of Sr to Er:Row");
        int Sr=sc.nextInt();
        int Er=sc.nextInt();

        System.out.println("Enter the range of Sc to Ec:Column");
        int Sc=sc.nextInt();
        int Ec=sc.nextInt();

        System.out.println(sum_Of_Element(arr,Sr,Er,Sc,Ec));

    }
}
