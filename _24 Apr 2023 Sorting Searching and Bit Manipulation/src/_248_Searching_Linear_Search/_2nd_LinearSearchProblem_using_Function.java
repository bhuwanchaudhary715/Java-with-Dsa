package _248_Searching_Linear_Search;

import java.util.Scanner;

class Searching{

    public static void linearSearch(int array[],int target){

        for(int i=0;i<array.length;i++){

            if(array[i]==target){

                System.out.println("Given Array Element is Found in Index:"+i);
                return;
            }
        }
        System.out.println("Given Array Element is Not found:");
    }
}

public class _2nd_LinearSearchProblem_using_Function {

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

        Searching.linearSearch(array,target);
    }
}
