package _236_Introduction_to_1D_Array_Palindrome_Problem;

public class _2nd_Palindrome_2nd_Approach {

    public static void main(String[] args) {

        // Time Complexity = O(n)
        // Space Complexity = O(1)

        int array[]={1,2,3,2,1};

        int n= array.length;

        int num=0;

        for(int i=0; i<n/2;i++){

            if(array[i]!=array[n-1-i]){

                num++;
            }
        }

        if (num != 0) {

            System.out.println("Given number is not palindrome");


        } else {


            System.out.println("Given number is palindrome");
        }
    }
}
