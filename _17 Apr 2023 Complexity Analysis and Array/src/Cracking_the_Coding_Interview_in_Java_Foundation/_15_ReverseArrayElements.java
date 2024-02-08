package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _15_ReverseArrayElements {

    // print Array only.
    static void printArray(int arr[]){

        for (int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }

    // Swap Array Elements Only.
    public static void swapArrayElements(int arr[],int i,int j){

         int temp = arr[i];
         arr[i]=arr[j];
         arr[j]=temp;

    }

    // Reverse Array Elements Only.
    public static void ReverseArray(int arr[]){

        int i=0;
        int j=arr.length-1;

        while(i < j){

            swapArrayElements(arr,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int arr[]={2,3,4,5,6,7};

        ReverseArray(arr);

        printArray(arr);
    }
}
