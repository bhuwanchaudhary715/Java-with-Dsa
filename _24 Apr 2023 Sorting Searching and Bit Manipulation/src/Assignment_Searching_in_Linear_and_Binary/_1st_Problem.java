
  /*
   Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element,
   else print “Element not found in array”. Input the size of array, array from user and the element X from user.
   Use Linear Search to find the element.
  */

  package Assignment_Searching_in_Linear_and_Binary;

  import java.util.Scanner;

  class Searching{

      public static void linearSearch(int array[],int x){

          for (int i=0; i<array.length;i++){

              if( array[i]==x){

                  System.out.println("The index of given array elements:"+i);
                  return;
              }
          }

          System.out.println("Given elements is not found:");
      }
  }

  public class _1st_Problem {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Size:");
        int size=sc.nextInt();

        int array[]=new int[size];

        System.out.println("Enter the value of Array elements:");
        for(int i=0; i<array.length;i++){

            array[i]=sc.nextInt();

        }

        System.out.println("Enter the value of Target X:");
        int x=sc.nextInt();

        Searching.linearSearch(array,x);
    }
}
