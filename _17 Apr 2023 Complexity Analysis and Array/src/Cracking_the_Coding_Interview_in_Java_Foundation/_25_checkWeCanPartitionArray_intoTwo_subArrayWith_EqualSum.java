package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _25_checkWeCanPartitionArray_intoTwo_subArrayWith_EqualSum {

    static int printArraySum(int arr[]){

        int totalSum=0;

        for(int i=0;i<arr.length;i++){

            totalSum+=arr[i];
        }
       return totalSum;
    }
    static boolean returnPrefixSum_equal_suffixSum(int arr[]){

        int totalSum=printArraySum(arr);
        int prefixSum=0;
        int suffixSum;

        for (int i=1;i<arr.length;i++){

             prefixSum += arr[i-1];

            suffixSum=totalSum-prefixSum;

            if(prefixSum == suffixSum){

                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array elements:");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter the Array elements:");

        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();

        }

        System.out.println(returnPrefixSum_equal_suffixSum(arr));
    }
}
