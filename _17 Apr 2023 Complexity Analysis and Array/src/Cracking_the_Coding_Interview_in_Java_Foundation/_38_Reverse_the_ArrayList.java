package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _38_Reverse_the_ArrayList {

//    static void reverseList( ArrayList<Integer> list){
//
//        int i=0 ,j = list.size()-1;
//
//        while ( i < j){
//
//            /*
//
//           int temp = a;
//               a = b;
//               b = temp
//             */
//
//            Integer temp = Integer.valueOf(list.get(i));
//
//            list.set(i, list.get(j));
//            list.set(j,temp);
//            i++;
//            j--;
//
//        }
//        System.out.println(list);
//    }


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Original list are:");
        System.out.println(" "+list);

        System.out.println("reverseList  are:");
        Collections.reverse(list);
        System.out.println(list);

    }
}
