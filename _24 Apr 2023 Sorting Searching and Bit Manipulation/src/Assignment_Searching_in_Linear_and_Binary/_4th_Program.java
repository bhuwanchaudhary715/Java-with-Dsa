
/*
     Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element
     is not found in the array, report that as well.

     Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
     target = 5
     Output: Target 5 occurs 3 times

     Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
     target = 6
     Output: Target 6 occurs 2 times

 */


package Assignment_Searching_in_Linear_and_Binary;

import java.util.Scanner;

class SortedInteger{

    public static int containingDuplicate(int array[],int target){

        int count=0;
        for(int i=0; i<array.length;i++){

            if(array[i]==target){

                count++;
            }
        }
        return count;
    }
}

public class _4th_Program {

    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Size:");
        int size=sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the value of Array elements:");
        for(int i=0; i<array.length;i++){

            array[i]= sc.nextInt();
        }

        System.out.println("Enter the value of Target:");
        int target=sc.nextInt();

        int count=SortedInteger.containingDuplicate(array,target);

        System.out.println("Target "+target+" occurs "+count+" times");
    }
}
