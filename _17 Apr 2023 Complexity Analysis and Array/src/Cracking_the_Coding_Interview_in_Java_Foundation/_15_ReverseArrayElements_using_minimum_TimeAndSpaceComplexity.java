package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _15_ReverseArrayElements_using_minimum_TimeAndSpaceComplexity {

    public static int [] printReverseArray(int arr[]){

        int n=arr.length;

        for(int i = 0 ; i < n/2 ; i++ ){

                int temp=arr[i];
                arr[i]=arr[n-1-i];
                arr[n-1-i]=temp;

        }
        return arr;
    }

    public static void main(String[] args) {

         int arr[]={1,2,3,4,5,6};

         printReverseArray(arr);

         for(int i=0;i<arr.length;i++){

             System.out.print(" "+arr[i]);
         }
    }
}
