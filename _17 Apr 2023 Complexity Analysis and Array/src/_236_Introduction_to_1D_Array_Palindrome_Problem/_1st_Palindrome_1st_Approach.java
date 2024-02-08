package _236_Introduction_to_1D_Array_Palindrome_Problem;

public class _1st_Palindrome_1st_Approach {

    public static void main(String[] args) {

        // Time Complexity= O(n)
        // Space Complexity= O(n)

         int array1[]={1,0,1};

        int n=array1.length;

         int array2[]=new int[n];

         int count=0;

         int j=0;

         for(int i= n-1;i >=0;i--){

            array2[j++]=array1[i];

         }

         for(int i=0;i<n;i++){

             if(array1[i]==array2[i]){

                 count++;
             }
         }

         if(count==n){

             System.out.println("Given number is palindrome");
         }else {

             System.out.println("Given number is not a palindrome");
         }
    }
}
