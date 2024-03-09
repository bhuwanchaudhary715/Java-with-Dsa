/**
 *
 * Q5. Given an array of integers, print an arraylist containing only all positive integers present in
 *  the array.If no positive integers found, print “NA”.
 * (Easy)
 *
 * Input1:  n = 5
 *          arr[] = {-4, 0, 8, -3, -2}
 * Output1: 0 8
 *
 * Input2: n = 1
 *         list = {-4}
 * Output2:NA
 *
 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.ArrayList;

public class _39_Assignment {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(-4);
        list.add(0);
        list.add(8);
        list.add(-3);
        list.add(-2);


        for(int i=0;i< list.size();i++){

            Integer t = list.get(i);

            if( t >= 0){  // <-- this line checking the condition whether the [ t >= 0 ]

                System.out.print(" "+list.get(i));
            }

        }
    }
}
