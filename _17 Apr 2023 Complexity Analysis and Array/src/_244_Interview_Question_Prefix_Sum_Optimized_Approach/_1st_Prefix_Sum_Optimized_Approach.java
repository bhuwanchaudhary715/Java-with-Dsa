package _244_Interview_Question_Prefix_Sum_Optimized_Approach;

import java.util.Scanner;
class PrefixSum{

    public static void printSumMatrix(int array[][]){

        // Traversed the Array Row-wise to calculate the Row-wise Prefix sum
        for(int i=0;i< array.length;i++){

            for(int j=1;j< array[0].length;j++){

                 array[i][j]+=array[i][j-1];
            }
        }

       // Traversed the Array Column-wise to calculate the Column-wise Prefix sum
        for(int j=0;j<array.length;j++){

            for(int i=1;i< array[0].length;i++){

                array[i][j]+=array[i-1][j];
            }
        }
    }

    public static int SumRegion(int array[][],int r1,int c1,int r2,int c2){

        int totalSum = 0 , up = 0 , left =0 , repeated_region=0 , result=0 ;

        totalSum = array[r2][c2];
        up = array[r1-1][c2];
        left = array[r2][c1-1];
        repeated_region = array[r1-1][c1-1];

        result = totalSum-left - up + repeated_region;
        return result;
    }
}

public class _1st_Prefix_Sum_Optimized_Approach {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Row Matrix:");
        int m=sc.nextInt();

        System.out.println("Enter the Size of Column Matrix:");
        int n=sc.nextInt();

        int array[][]=new int[m][n];

        System.out.println("Enter the Value of Rows and Columns:");
        for(int i=0;i<m;i++){  // --> Rows

            for(int j=0;j<n;j++){  // --> Columns

                array[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the value of Coordinate-r1:");
        int r1=sc.nextInt();

        System.out.println("Enter the value of Coordinate-c1:");
        int c1=sc.nextInt();

        System.out.println("Enter the value of Coordinate-r2");
        int r2=sc.nextInt();

        System.out.println("Enter the value of Coordinate-c2");
        int c2=sc.nextInt();

        PrefixSum.printSumMatrix(array);

        int result = PrefixSum.SumRegion(array,r1,c1,r2,c2);

        System.out.println("Sum of Given Array rectangle:"+result);


    }
}
