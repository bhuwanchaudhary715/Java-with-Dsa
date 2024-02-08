package _236_Introduction_to_1D_Array_Palindrome_Problem;

public class _3rd_Palindrome_2nd_Approach {

    public static void main(String[] args) {

        // Time Complexity=O(n)
        // Space Complexity=O(1)

        int array[]={1,2,3,3,2,1};

        int n=array.length;

        int flag=0;

        for(int i=0;i<n/2;i++){

            if(array[i]!=array[n-1-i]){

                flag=1;
                System.out.println("Given number not a palindrome");
                return;
            }
        }
        if(flag==0){

            System.out.println("Given number is a palindrome:");
        }
    }
}
