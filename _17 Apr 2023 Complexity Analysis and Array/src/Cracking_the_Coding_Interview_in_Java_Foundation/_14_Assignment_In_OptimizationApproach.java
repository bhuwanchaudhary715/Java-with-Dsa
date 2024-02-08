package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _14_Assignment_In_OptimizationApproach {

    // This method is print only Array Elements .

    static  void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);

        }
    }
    static void swapArrayElements(int arr[],int i,int j ){

        int temp = arr[i];
          arr[i] = arr[j];
          arr[j]=temp;
    }

    public static void optimizationApproach(int arr[]){

     //  Arranging L.H.S to positive value and R.H.S to negative value
        int left=0;
        int right=arr.length-1;
        while( left < right ){


            if( arr[left] > 0  ){

                left++;
            }


            if(arr[right] < 0 ){

                right--;
            }


            if( arr[left] < arr[right] ) {

                swapArrayElements(arr, left, right);
                left++;
                right--;
            }

        }

     // Arrange the N,P,N,P throw out the array elements.

//        int i=0;
//        int j= arr.length-1;
//
//        while ( i < j ){
//
//            if( arr[i] > arr[j]){
//
//                swapArrayElements(arr,i,j);
//                i=i+2;
//                j=j-2;
//
//            }
//        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Size array:");
        int size = sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter the value of Array elements:");
        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();

        }

        optimizationApproach(arr);
        printArray(arr);




    }
}
