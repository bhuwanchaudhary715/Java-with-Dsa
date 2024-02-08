  /*
Q4: Write a program to find out the Second Largest element in a given array.

Input 1: arr[] = {34,21,54,65,43}
Output 1: 54

Input 1: arr[] = {4,3,6,7,1}
Output 1: 6

  */


package _1D_Array_Assignment;

  import java.util.Scanner;

    public class _4th_Program {

      public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the Size of an Array Elements:");
          int n=sc.nextInt();

          int array[] = new int[n];

          System.out.println("Enter the Matrix Elements:");
          for(int i=0 ; i< array.length; i++){

              array[i]=sc.nextInt();
          }

          // To find the Largest number inside the given Array
          int maxNum=0;
          for(int val : array){

              maxNum=Math.max(maxNum,val);

             }
          // TO initialized the only starting from second largest to Small number.
          int j=0;
          for(int i=0;i<array.length;i++){

              if( maxNum!=array[i]){

                  array[j++]=array[i];
              }
          }

          // To find the Second largest number inside the given Array.
          int max=0;
          for(int val1  :array){

              max=Math.max(max,val1);
          }
          System.out.println(max);
    }
}
