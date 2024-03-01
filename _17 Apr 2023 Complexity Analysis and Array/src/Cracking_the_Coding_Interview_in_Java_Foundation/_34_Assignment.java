/**
 * Q1 - Given a matrix arr[][] of integers, print the prefix sum matrix for it .  [ Easy ]
 * Input1:
 *       n = 3
 *       m = 3
 *
 *     [ [1,2,3],
 *       [4,5,6],
 *       [7,8,9] ]
 *
 * Output1:
 *       [ [1,3,6],
 *         [5,13,25],
 *         [12,33,67] ]
 *
 * Input2:
 *       n = 2
 *       m = 3
 *
 *     [ [1,0,1],
 *       [0,1,0] ]
 *
 * Output2:
 *       [ [1,1,2],
 *        [1,3, 5] ]
 *
 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _34_Assignment {
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


    }
}
