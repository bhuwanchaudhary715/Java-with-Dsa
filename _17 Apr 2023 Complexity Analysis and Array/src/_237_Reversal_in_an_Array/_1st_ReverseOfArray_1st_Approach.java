package _237_Reversal_in_an_Array;

public class _1st_ReverseOfArray_1st_Approach {

    public static void main(String[] args) {

        // Time Complexity =O(n)
        // Space Complexity =O(1) --> Constant complexity

        int array[]={2,4,6,8,10,12,14,16,18};

        int n=array.length;

        int temp=0;

        for(int i=0;i<n/2; i++){

            // Swap the Array Elements

            temp=array[i];
            array[i]=array[n-1-i];
            array[n-1-i]=temp;
        }

        for(int i=0;i< array.length;i++){

            System.out.print(array[i]+" ");
        }
    }
}
