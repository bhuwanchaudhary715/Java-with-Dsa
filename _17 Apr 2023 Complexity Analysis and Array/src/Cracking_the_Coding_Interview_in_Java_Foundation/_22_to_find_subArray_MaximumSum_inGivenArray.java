package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _22_to_find_subArray_MaximumSum_inGivenArray {

    /**
     *
     *            This is the code is bruteforce approach .
     * @return
     */
    public static int printSubMaxArray(int arr[]){

        int maxSum=Integer.MIN_VALUE;
        int sum=0;

        for (int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++) {

                sum += arr[j];

             //   maxSum=Math.max(sum,maxSum);   OR

                if(maxSum < sum){

                    maxSum =sum;
                }


                if( j == arr.length-1){

                    sum=0;
                }



            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

          int arr[] = {-1,3,4,-2};

        System.out.println(printSubMaxArray(arr));
    }
}
