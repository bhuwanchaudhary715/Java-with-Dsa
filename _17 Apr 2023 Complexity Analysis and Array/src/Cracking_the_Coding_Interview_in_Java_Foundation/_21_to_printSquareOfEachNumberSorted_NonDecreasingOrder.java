package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _21_to_printSquareOfEachNumberSorted_NonDecreasingOrder {

    // This method is print only Array Elements .
    static  void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);

        }
    }

    // Swap the both sides elements.
    static void swapArrayElements(int arr[],int i,int j ){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;

    }

    // This Operation is used for only Reversing Array elements.
    static void reverseArrayElements(int arr[]){

        int left=0;
        int right=arr.length-1;

        while ( left < right){

            if( arr[left] > arr[right]){

                swapArrayElements(arr,left,right);
                left++;
                right--;
            }
        }
    }

    // This operation is used for Only Assignment value Decreasing Order
    public static int[] printSortedArray(int arr[]){

        int n=arr.length;
        int ans[]=new int[n];

        int i=0;
        int j=arr.length-1;
        int idx=0;

        while( i < j ){

            if(Math.abs(arr[i]) >= Math.abs(arr[j])){

                ans[idx++]=arr[i]*arr[i];
                i++;
            }

            if( Math.abs(arr[i]) <= Math.abs(arr[j])){

                ans[idx++]=arr[j]*arr[j];
                j--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[]={-10,-3,-2,1,4,5};


        int ans[]=printSortedArray(arr);

        reverseArrayElements(ans);
        printArray(ans);
    }
}
