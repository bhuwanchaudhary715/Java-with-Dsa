package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.ArrayList;
import java.util.Collections;

public class _39_Sorted_the_ArrayList {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(442);
        list.add(33);
        list.add(4);
        list.add(54);
        list.add(6);

        System.out.println("Original list are:");
        System.out.println(" "+list);

        // -->  Sorted in Ascending order
        Collections.sort(list);
        System.out.println(" sorted in Ascending order "+ list);

        // -->  Sorting in Descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(" Sorting in Descending order "+list);

        ArrayList <String> list2 = new ArrayList<>();

        list2.add("welcome");
        list2.add("to");
        list2.add("physics");
        list2.add("wallah");

        System.out.println("Original list2:");
        System.out.println(list2);

        Collections.sort(list2,Collections.reverseOrder()); //
        System.out.println("Sorted list2:");
        System.out.println(list2);


    }
}
