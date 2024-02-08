
package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _17_Rotate_GivenArray_K_Steps_Without_Using_ExtraSpace {

    // print Array only.
    static void printArray(int arr[]){

        for (int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }

    // Swap the Array Only.
    public static void swapArray(int arr[],int i,int j){

        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    //  Reverse the Array Only .
    public static void reverseArray(int arr[],int start,int end){

        while( start < end){

            swapArray(arr,start,end);

            start++;
            end--;

        }
    }

    public static int[] rotatedInPlace(int arr[],int k){

        int n=arr.length;
          
        k = k % n;


        reverseArray(arr,0,n-k-1);  // <-- rev(p1)
        reverseArray(arr,n-k,n-1);  // <-- rev(p2)
        reverseArray(arr,0,n-1);    // <-- rev[rev(p1)+rev(p2)]

        return arr;
    }



    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};

        int ans[]= rotatedInPlace(arr,2);
        printArray(ans);

        //  Over All Complexity

        //  Time complexity = O(n)
        //  Space complexity = O(1)
        
    }
}
