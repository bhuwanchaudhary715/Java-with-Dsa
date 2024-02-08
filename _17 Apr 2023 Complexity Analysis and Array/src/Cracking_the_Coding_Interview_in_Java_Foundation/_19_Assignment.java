
/*

    Q5. Given an array sorted in increasing order, return an array of squares of each number sorted
        in increasing order.

        Input1:
               N = 6
               Arr[] = [-5, -2, -1, 0, 4, 6]
        Output1:
              [0, 1, 4, 16, 25, 36]

        Input2:
               N = 5
               Arr[] = [2, 1, 0, 4, 6]
        Output2:
              [0, 1, 4, 16, 36]
 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _19_Assignment {

    // This method is print only Array Elements .

    public static  void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);

        }
    }

    public static int[] printArrayOfSquare(int arr[]){

        int n=arr.length;

        int ans[]= new int[n];

        int left=0;
        int right=arr.length-1;
        int idx=ans.length-1;

        while ( left < right) {

            if( Math.abs(arr[left]) >= Math.abs(arr[right])){

                ans[idx--]=arr[left]*arr[left];
                left++;

            } if (Math.abs(arr[left]) <= Math.abs(arr[right])) {

                ans[idx--]=arr[right]*arr[right];
                right--;

            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int array[]={5, -2, -1, 3, 4, 6};

        int ans[] = printArrayOfSquare(array);

        printArray(ans);
    }
}