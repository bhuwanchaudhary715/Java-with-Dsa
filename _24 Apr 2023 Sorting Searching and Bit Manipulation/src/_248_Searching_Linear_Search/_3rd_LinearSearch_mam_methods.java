package _248_Searching_Linear_Search;

import java.util.Scanner;

public class _3rd_LinearSearch_mam_methods {

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

        int Index=-1;
        for(int i=0;i<array.length;i++){

            if(array[i]==target){

                Index=i;
                break;
            }
        }

        if(Index==-1){

            System.out.println("Given Array element is not Found any index:");

        }else {

            System.out.println("Given Array element is Found index:"+Index);
        }
    }
}
