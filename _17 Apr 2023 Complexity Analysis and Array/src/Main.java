import java.util.Scanner;

class Demo {
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        for(int i=0; i <=n-k-1;i++){

            int temp=nums[n-k-1];
            nums[n-k-1]=nums[i];
            nums[i]=temp;

        }

        for(int i=n-k;i<n;i++){

            int temp=nums[i];
            nums[i]=nums[n-k];
            nums[n-k]=temp;
            i++;


        }

        int i=0;
        int j=nums.length-1;
        while(i < j){

            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;

        }

        for(int p=0;p<n;i++){

            System.out.print(" "+nums[p]);
        }

    }

    public static void main(String[] args) {


        int arr[]={1,2,3,4,5,6,7};
        rotate(arr,3);

        String s="goal";

        int n=s.length();
    }
}