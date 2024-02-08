
/**
 *
 * Q4. Given a 0-indexed integer array nums, find the leftmost middleIndex ( i.e.,the smallest
 *     amongst all the possible ones).
 *     A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums
 *     [middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
 *     If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length-1,
 *     the right side sum is considered to be 0.
 *     Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
 *
 *     input1:
 *     n = 5
 *     nums = []
 *     Output1:
 *       3
 *
 *    Input2:
 *    n = 3
 *    nums = [1,-1,4]
 *    Output2:
 *        2
 */




package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _23_prefixSum_withCreating_aNewArray_Good_approach {

    public static int printPrefixSum(int arrays[]){


        int sum=0;

        for(int array: arrays){

            sum +=array;

        }

        int left=0;
        int right=sum;

        for(int i=0;i<arrays.length;i++){


                right = right-arrays[i];

                if(left == right){

                    return i;
                }

                left = left+arrays[i];

        }

        return -1;
    }

    public static void main(String[] args) {


        int arr[]={1,-1,4};

        System.out.println(printPrefixSum(arr));

    }
}
