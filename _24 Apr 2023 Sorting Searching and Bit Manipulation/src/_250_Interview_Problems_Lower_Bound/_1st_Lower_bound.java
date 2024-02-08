package _250_Interview_Problems_Lower_Bound;

import java.util.Scanner;

class LowerOccurrence{

    public static int lowerBound(int array[],int target){

        int low=0 , high=array.length-1 , result=-1 ;

        while (low <= high){

             // To avoid the Overflow.
           int mid=low+(high-low)/2;

            if(array[mid]==target){

                high=mid-1;
                result= mid;

            }else if(array[mid] > target){

                high=mid-1;

            }else {

                low=mid+1;
            }
        }
        return result;
    }
}

public class _1st_Lower_bound {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Size:");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the value of matrix elements:");
        for (int i=0;i< arr.length ; i++){

            arr[i]=sc.nextInt();
        }

          Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the value of Target:");
        int target=sc1.nextInt();

        int result = LowerOccurrence.lowerBound(arr,target);

        if(result==-1){

            System.out.println("Given array number is Not Found:");

        }else {

            System.out.println("Given array number is found index:"+result);
        }
    }
}
