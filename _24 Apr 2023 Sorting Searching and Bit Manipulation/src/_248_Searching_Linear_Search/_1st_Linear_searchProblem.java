package _248_Searching_Linear_Search;

import java.util.Scanner;

public class _1st_Linear_searchProblem {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

          System.out.println("Enter the size of Array:");     // Time Complexity= O(n)
          int n=sc.nextInt();                                 // Space Complexity=O(1)

          int array[]=new int[n];

        System.out.println("Enter the array elements Matrix:");
        for(int i=0;i< array.length;i++){

            array[i]=sc.nextInt();
        }

        System.out.println("Enter the target Elements:");
        int target= sc.nextInt();

        for(int i=0;i<array.length;i++){

            if(array[i]==target){

                System.out.println("Given element is found in indexNum:"+i);
                return;
            }
        }
        System.out.println("Given element is not found:");

    }
}
