package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _24_printSumOfValue_inGivenRange {
    static int[] returnPrefixSum(int arr[]) {

        for (int i = 2; i < arr.length; i++) {

            arr[i] = arr[i - 1] + arr[i];

        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array elements:");
        int size=sc.nextInt();

        int arr[]=new int[size+1];

        System.out.println("Enter the Array elements:");

        for(int i=1;i<arr.length;i++){

            arr[i]=sc.nextInt();

        }

        int prefixSum[]=returnPrefixSum(arr);

        System.out.println("Enter the value of Queries");
        int Q=sc.nextInt();
        while(0 < Q){

            System.out.println("Enter the value of l:");
            int l=sc.nextInt();

            System.out.println("Enter the value of r:");
            int r=sc.nextInt();

            int sum=prefixSum[r]-prefixSum[l-1];
            System.out.println(sum);

            Q--;
       }
    }
}
