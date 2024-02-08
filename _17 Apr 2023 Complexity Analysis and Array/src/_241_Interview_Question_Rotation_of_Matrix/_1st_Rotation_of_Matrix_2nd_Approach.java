package _241_Interview_Question_Rotation_of_Matrix;

import java.util.*;

public class _1st_Rotation_of_Matrix_2nd_Approach {

    // Time Complexity = O(n^2).
    // Space Complexity= O(1).

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of the 2D Array:");
        int m=sc.nextInt();
        int n=sc.nextInt();

        int array[][]=new int[m][n];

        System.out.println("Enter the value of Matrix:");

        for(int i=0;i<m;i++){  //  --> Row

            for(int j=0;j<n;j++){  //   --> Column

                array[i][j]=sc.nextInt();
            }
        }

        System.out.println("Display Matrix:");
        for(int i=0;i<m;i++){  //  --> Row
         //
            for(int j=n-1;j>=0;j--){  //   --> Column


                System.out.print(array[j][i]+" ");
            }
            System.out.println();
        }
    }
}
