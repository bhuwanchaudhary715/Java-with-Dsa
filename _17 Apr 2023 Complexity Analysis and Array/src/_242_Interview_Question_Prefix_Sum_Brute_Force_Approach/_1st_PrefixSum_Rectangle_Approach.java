package _242_Interview_Question_Prefix_Sum_Brute_Force_Approach;

import java.util.Scanner;

class PrefixSum{

    public static int printSumMatrix(int array[][],int r1,int c1,int r2,int c2){

        int sum=0;

        for(int i=r1;i<=r2;i++){

            for(int j=c1;j<=c2;j++){

                sum+=array[i][j];

            }
        }

        return sum;
    }
}

public class _1st_PrefixSum_Rectangle_Approach {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Row Matrix:");
        int m=sc.nextInt();

        System.out.println("Enter the Size of Column Matrix:");
        int n=sc.nextInt();

        int array[][]=new int[m][n];

        System.out.println("Enter the Value of Rows and Columns:");
        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){

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

        int sum=PrefixSum.printSumMatrix(array,r1,c1,r2,c2);

        System.out.println("Sum of Rectangle Element:"+sum);



    }
}
