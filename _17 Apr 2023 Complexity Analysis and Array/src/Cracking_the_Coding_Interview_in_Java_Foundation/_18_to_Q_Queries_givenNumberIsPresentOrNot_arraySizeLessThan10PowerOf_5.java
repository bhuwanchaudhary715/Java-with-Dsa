package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Scanner;

public class _18_to_Q_Queries_givenNumberIsPresentOrNot_arraySizeLessThan10PowerOf_5 {

    public static int[] frequencyArray(int array[]){

        int freq[]=new int[1000005];

        for(int i=0;i<array.length;i++){

            freq[array[i]]++;

        }

        return freq;
    }

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        int arr[]={5,6,5,400,560,1000,400};

        System.out.println("Enter the Queries");
        int queries=sc.nextInt();

        int freq[] = frequencyArray(arr);

        while( queries > 0){

            System.out.println("Enter the Queries number:");
            int x = sc.nextInt();

            if( freq[x] > 0 ){

                System.out.println("Yes");

            }else {

                System.out.println("No");

            }

            queries--;
        }
    }
}
