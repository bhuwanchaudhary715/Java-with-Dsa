/*

Q4: Write a program to find the largest element of a given 2D array of integers.   (Easy)

Input 1:
         1 2 4 0
         2 5 7 -1
         4 2 6 9

Output : 9

 */


package _2D_Array_Assignments;

import java.util.Scanner;

public class _4th_program {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Row:");      // Time Complexity= O(n*n)
        int m=sc.nextInt();                                // Space Complexity=O(1)

        System.out.println("Enter the Size of Column:");
        int n=sc.nextInt();

        int array[][]=new int[m][n];

        System.out.println("Enter the Matrix Elements:");
        for (int i=0; i<m; i++){

            for(int j=0; j<n ;j++){

                array[i][j]=sc.nextInt();
            }
        }

        int maxNum=0;
        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){

                maxNum=Math.max(maxNum,array[i][j]);
            }
        }

        System.out.println("Largest element of a given 2D array of integers:"+maxNum);


    }
}
