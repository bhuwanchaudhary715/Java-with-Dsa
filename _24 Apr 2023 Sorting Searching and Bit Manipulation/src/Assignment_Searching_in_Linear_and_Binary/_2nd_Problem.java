
/*
    Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
not present return -1.

Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
Output 1: 6

Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
Output 2: -1

 */

package Assignment_Searching_in_Linear_and_Binary;

import java.util.Scanner;

class Occurrence {

    public static int lastOccurrence(int array[],int target){

        int low=0, high=array.length-1 ,result=-1;

        while (low <= high){

            int mid=(low+high)/2;

            if( array[mid]==target){

                result=mid;
                low=mid+1;

            }else if (array[mid] < target){

                low=mid+1;

            }else {

                high=mid-1;
            }
        }
        return result;
    }
}

public class _2nd_Problem {

    public static void main(String [] arg) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Size");
        int size=sc.nextInt();

        int array[]=new int[size];

        System.out.println("Enter the value of array elements:");
        for(int i=0;i<array.length;i++){

            array[i]=sc.nextInt();
        }

        System.out.println("Enter the value of target:");
        int Target=sc.nextInt();

        int result= Occurrence.lastOccurrence(array,Target);

        if(result==-1){

            System.out.println("Given element is not Found:"+-1);

        }else {

            System.out.println("The Last Occurrence in Given array element:"+result);
        }
    }
}
