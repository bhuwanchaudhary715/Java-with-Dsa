/**
 * Q1. Write a Java program to insert an element into given array list of size n at the first position.(Easy)
 *
 *Input 1:
 *        n = 5
 *        list = {1,2,3,4,5}
 *        x = 0
 *
 * Output 1: 0 1 2 3 4 5
 *
 * Input 2:
 *         n = 1
 *         list = {4}
 *         x = 7
 *
 * Output 2: 7 4
 *
 */


package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.ArrayList;
import java.util.Scanner;

public class _35_Assignment {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X:");
        int x=sc.nextInt();

        System.out.println("Original Arraylist:"+list);

        list.add(1,x);
        System.out.println("After changing:"+list);


    }
}
