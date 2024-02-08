package _267_Count_of_number_of_stairs;

import java.util.Scanner;

 class CountNum{

         // function definition.
     public static int findingNumStair(int number){

         if( number <=1){   //  Base case Condition .

             return number;

         }else {

             return findingNumStair(number-1)+findingNumStair(number-2);   //  Recursive Call .
         }
     }
 }

public class _1st_Count_Num_of_Stairs {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Number:");
        int Number=sc.nextInt();

        int result = CountNum.findingNumStair(Number+1);

        System.out.println("The count of Stair Number is:"+result);
    }
}
