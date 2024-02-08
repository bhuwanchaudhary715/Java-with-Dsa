package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _16_Rotate_GivenArray_K_Steps {

    // print Array only.
    static void printArray(int arr[]){

        for (int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }

     // Rotate Array Only>
    public static int[] RotateArray(int arr[],int k){

        int n=arr.length;

         k = k % n;   // <-- this line taking Modulus

         int j=0;

        int ans[]=new int[n];

     // First Portion Only .
        for (int i = n-k ; i <= n-1 ; i++){

            ans[j++] = arr[i];

        }

      // Second portion Only .
        for (int i=0 ; i <= n-k-1 ; i++){

            ans[j++] = arr[i];

        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};

       int ans[]= RotateArray(arr,13);
        printArray(ans);
    }
}
