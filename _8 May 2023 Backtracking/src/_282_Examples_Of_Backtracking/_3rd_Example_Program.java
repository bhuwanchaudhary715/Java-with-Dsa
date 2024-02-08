package _282_Examples_Of_Backtracking;

public class _3rd_Example_Program {

    public static String swap(String str,int i,int j){

        char temp;
        char c[]=str.toCharArray();  // converting string into char array.

              temp = c[i];
              c[i]=c[j];
              c[j]=temp;

              return String.valueOf(c);   // return char array
    }

    /*

    str - input String

   left - Starting index

   right - Ending index

     */

    public static void printPermute( String str,int left,int right){

        // Base case condition.
        if( left == right){

            System.out.println(str);
        }

        for(int i=left;i<=right;i++){

            str=swap(str,left,i);
            printPermute(str,left+1,right);

            // BackTracking
            str=swap(str,left,i);
        }
    }

    public static void main(String[] args) {

        String str="XYZ";

        int n=str.length();

        System.out.println("The permutation "+str+" is:");

        printPermute(str,0,n-1);




    }
}
