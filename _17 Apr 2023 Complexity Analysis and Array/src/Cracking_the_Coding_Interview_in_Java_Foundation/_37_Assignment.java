/**
 *
 * 3. Write a Java program to swap two elements in an array list of size n. [ Easy ]
 *
 * input 1:
 *        n = 5
 *        list = {1,2,3,4,5}
 *        Index = 2, 4
 * Output 1:
 *        1 2 5 4 3
 *
 * Input2:
 *        n = 2
 *        list = {4, 9}
 *        Index = 0, 1
 * Output2:
 *        9 4
 *
 */


package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.ArrayList;
import java.util.Scanner;

public class _37_Assignment {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of value i and j:");
        int i=sc.nextInt();
        int j=sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);


        Integer temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);



        System.out.println(list);
    }
}
