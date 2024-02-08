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

public class _23_Assignment {


    static int  prefixSum(int num[]){          // <-- This is a brute force approach (not a good Approach)

        int n=num.length;

        // for left side
         int left[]=new int[n];
         left[0]=0;

         // for right side
        int right[]=new int[n];
        right[n-1]=0;


        // PrefixSum of new left side Array.
        for(int i=1;i<num.length;i++){

            left[i] = left[i-1]+num[i-1];
        }


        // SuffixSum of new right side Array
        for (int j=n-2;j>=0;j--){

            right[j]=right[j+1]+num[j+1];
        }


        for (int i=0;i<n;i++){
            // Check if left Equal to right or not.
            if(left[i] == right[i]){

                return i;
            }
        }

        return -1;
    }



    public static void main(String[] args) {

        int num[] = {2, 3, -1, 8, 4};


        System.out.println(prefixSum(num));

    }
}
