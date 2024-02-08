package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _10_to_find_secondLargestElements_inGivenArray {

    // finding the First Maximum value.
    public static int printFirstMaxVal(int array[]){

        int max=Integer.MIN_VALUE;   // (-) Infinity

        for(int i=0;i<array.length;i++){

            if( array[i] > max){

                max=array[i];
            }
        }
        return max;
    }


    public static int printSecondMaxVal(int array[]){

        int max=printFirstMaxVal(array);

        // Assign FirstMaxVal to - infinity ( MIN_VALUE )
        for(int i=0;i<array.length;i++){

            if(array[i] == max){

                array[i]=Integer.MIN_VALUE;
            }
        }

        // finding the second Maximum value.
        int secondMax=Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){

            if(array[i] > secondMax){

                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Size:");
        int size = sc.nextInt();

        int arr[]= new int[size];

        System.out.println("Enter the value of Array Elements:");
        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();

        }

        System.out.println("Second maxVal is:"+printSecondMaxVal(arr));


    }
}
