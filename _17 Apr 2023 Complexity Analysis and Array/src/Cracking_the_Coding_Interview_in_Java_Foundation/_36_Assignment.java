/**
 *
 * Q2. Write a Java program to remove the third element from given arraylist of size n.  [ Easy ]
 *
 * Input 1:
 *         n = 5
 *         list = {1,2,3,4,5}
 *
 * Output 1:
 *          1 2 4 5
 *
 * Input 2:
 *          n = 5
 *          list = {1,2,3,4,5}
 *
 * Output 2:
 *           2 5
 *
 *
 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.ArrayList;

public class _36_Assignment {

    public static void main(String[] args) {
        
         //  
        ArrayList<Integer> list =new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Before removing:"+list);


        System.out.println("After removing :");
        list.remove(Integer.valueOf(3));
        System.out.print(" "+list);
    }
}
