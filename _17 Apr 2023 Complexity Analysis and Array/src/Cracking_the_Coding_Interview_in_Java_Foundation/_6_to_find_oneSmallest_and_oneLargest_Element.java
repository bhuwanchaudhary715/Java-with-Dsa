package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.Arrays;
import java.util.Scanner;

public class _6_to_find_oneSmallest_and_oneLargest_Element {


    public static int[] printSmallestAndGreatestKthElements(int array[], int k) {

        int size = array.length;
        int ans[] = new int[size];

        Arrays.sort(array);

        int idx = 0;

        // Smallest kth elements in given array.
        for (int i = 0; i < array.length; i++) {

            if ( (i+1)  == k) {

                ans[idx++] = array[i];

            }
        }

        // largest kth elements in given array.
        int k2 = array.length-k;
        for (int i = array.length - 1; i >= 0; i--) {

            if ( i == k2 ) {

                ans[idx++] = array[i];

            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the array:");
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the value of Matrix Elements are:");
        for (int i = 0; i < array.length; i++) {

            array[i] = sc.nextInt();
        }

        System.out.println("Enter the value of K is :");
        int k = sc.nextInt();

        int ans[] = printSmallestAndGreatestKthElements(array, k);

        System.out.println("The Smallest kth element is:" + ans[0]);
        System.out.println("The Greatest Kth element is:" + ans[1]);
    }
}
