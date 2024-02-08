package _241_Interview_Question_Rotation_of_Matrix;

import java.util.*;
import java.io.*;

class Rotating2DArray{

    public static void RotatedMatrix(int arr[][]) {

        // Step-1 Transpose the 2D Array.

        for (int i = 0; i < arr.length; i++) {

            int temp = 0;

            for (int j = i; j < arr[0].length; j++) {

                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }



        // Step-2 swap the left and Right Side Column.
        for (int i = 0; i < arr.length; i++) {
            int n = 0;

            int m = arr[0].length - 1;

            while (n < m) {

               int temp = arr[i][n];
                arr[i][n] = arr[i][m];
                arr[i][m] = temp;

                m--;
                n++;
            }
        }
    }
}

public class _1st_Rotation_of_Matrix_1st_Approach {

    public static void main(String[] args) {

        int arr[][]={
                {1 ,2 ,3, 4},
                {5 ,6 ,7 ,8},
                {9 ,10,11,12},
                {13,14,15,16}
        };

        Rotating2DArray.RotatedMatrix(arr);

        for(var mat:arr){
            System.out.println(Arrays.toString(mat));
        }
        }
    }

