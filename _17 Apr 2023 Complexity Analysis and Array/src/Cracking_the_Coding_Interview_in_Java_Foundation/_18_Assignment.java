
/*
     Q4. Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
         find two numbers such that they add up to a specific target number.  ( Medium )

         Return the indices of the two numbers added by one. Return -1 if pair does not exist.

         Input1:
                 n = 4
                 numbers = [2,7,11,15]
                 target = 9
         Output1:
                 1 2

         Input2:
                 n = 2
                 numbers = [-1,0]
                 target = -1
         Output2:
                  1 2

 */



package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _18_Assignment {

    public static void printIndexOfTwoNumber(int arr[],int target){

        int left =0;
        int right=arr.length-1;

        while (left < right){

            if( arr[left]+arr[right] == target ){

                System.out.println(++left +" "+ ++right);
                return;

            }else if ( arr[left] + arr[right] > target){

                right--;

            }else {

                left++;
            }
        }

        System.out.println(-1);
    }

    public static void main(String[] args) {

        int arr[]={2,7,11,15};

        printIndexOfTwoNumber(arr,9);


        }

    }

