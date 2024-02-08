
  /*
    Q5: Given a positive integer num, return true if num is a perfect square or false otherwise.

     A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer
     with itself.

     Example 1:
     Input: num = 16
     Output: true
     Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

     Example 2:
     Input: num = 14
     Output: false
     Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer

   */

package Assignment_Searching_in_Linear_and_Binary;

  import java.util.Scanner;

  class PositiveInteger{

      public static boolean perfectSquare(int num){

          int low=0, high=num , mid=0;

          boolean result= true;

          while (low <= high){

              mid=(low+high)/2;
              long value=mid*mid;

              if( value == num){

                  return true;

              } else if (value < num ) {

                  result=false;
                  low=mid+1;

              }else {

                  high=mid-1;
              }
          }
          return result;
      }
  }

  public class _5th_Program {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of num element:");
        int num=sc.nextInt();

        boolean result = PositiveInteger.perfectSquare(num);

        System.out.println("Output:"+result);



    }
}
