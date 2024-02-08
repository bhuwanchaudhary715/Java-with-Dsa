package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _24_FollowUpQn_printSuffixSum {

    static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);

        }
    }

    public static int[] printSuffixArray(int arr[]){

        for(int i=arr.length-2;i >=0;i--){

            arr[i] = arr[i]+arr[i+1];
        }

        return arr;
    }

    public static void main(String[] args) {

        int arr[]={2,5,6,1,3};

        int suffixSum[] = printSuffixArray(arr);

        printArray(suffixSum);
    }
}
