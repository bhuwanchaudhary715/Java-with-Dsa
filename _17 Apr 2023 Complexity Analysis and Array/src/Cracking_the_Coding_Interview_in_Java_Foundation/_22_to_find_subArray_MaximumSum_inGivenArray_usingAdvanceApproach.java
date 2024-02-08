package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _22_to_find_subArray_MaximumSum_inGivenArray_usingAdvanceApproach {

    public static int printSubMaxArray(int arr[]) {

        int maxSum = arr[0];
        int sum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(sum >= 0){

                sum += arr[i];
            }else {

                sum=arr[i];
            }

            if( maxSum < sum){

                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int arr[] = {-1,3,4,-2};

        System.out.println(printSubMaxArray(arr));
    }
}
