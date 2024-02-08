/**
 *
 * Q3 - Given a n*m matrix, return true if the matrix is a Toeplitz matrix. A matrix is called Toeplitz
 *  if every diagonal from top-left to bottom-right has the same elements.  [ Medium ]
 *
 * Input1:
 *       n = 3
 *       m = 4
 *       arr[]=[[1, 2, 3, 4],[5, 1, 2, 3],[9, 5, 1, 2]]
 * Output1:
 *        true
 *
 *
 * Input2:
 *        n = 2
 *        m = 2
 *        Arr[] = [[1,2], [1, 2]]
 * Output2:
 *         false

 *
 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _31_Assignment {

    static boolean checkGiven_matrix_is_ToeplitzMatrix(int arr[][]){

        for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr[i].length-1;j++){

           if ( arr[i][j] != arr[i+1][j+1]  ){

                    return false;
                }
            }
        }
        return true;
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

        System.out.println( checkGiven_matrix_is_ToeplitzMatrix(arr));
    }
}
