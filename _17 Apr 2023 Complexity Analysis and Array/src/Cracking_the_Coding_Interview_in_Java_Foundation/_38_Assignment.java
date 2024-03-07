/**
 *
 * Q4. Given an input of some integers, sort the integers. (Easy)
 *
 * Input1: 3 5 1 -4 9 0 -2
 * Output1: -4 -2 0 1 3 5 9
 *
 * Input2: 0 -1
 * Output2: -1 0

 *
 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.ArrayList;
import java.util.Collections;

public class _38_Assignment {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(5);
        list.add(1);
        list.add(-4);
        list.add(9);
        list.add(0);
        list.add(-2);

        System.out.println("Before sorting :"+list );

        Collections.sort(list);
        System.out.println("After sorting :"+list);
    }
}
