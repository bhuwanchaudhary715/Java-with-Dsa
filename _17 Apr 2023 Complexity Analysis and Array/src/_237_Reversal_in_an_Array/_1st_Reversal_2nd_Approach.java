package _237_Reversal_in_an_Array;

public class _1st_Reversal_2nd_Approach {

    public static void main(String[] args) {

        // Time Complexity=O(1)
        // Space Complexity=O(1);

        int array[]={2,4,8,10,12,14};

        for(int i= array.length-1;i>=0;i--){

            System.out.print(array[i]+" ");
        }
    }
}
