package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _22_Assignment_Using_prefixSum {

    static int[] prefixSumOnly(int arr[]){    // By using PrefixSum methods.

        for(int i=1;i<arr.length;i++){

            arr[i] +=arr[i-1];
        }

        return arr;
    }

    static int returnHigherAltitudePoint(int gain[]){

        int prefixSum[]=prefixSumOnly(gain);


        int max=0;

        for(int i=0;i<prefixSum.length;i++){

            if(prefixSum[i] > max){

                max=gain[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int gain[]={-4,-3,-2,-1,4,3,2};
        System.out.println(returnHigherAltitudePoint(gain));

    }
}
