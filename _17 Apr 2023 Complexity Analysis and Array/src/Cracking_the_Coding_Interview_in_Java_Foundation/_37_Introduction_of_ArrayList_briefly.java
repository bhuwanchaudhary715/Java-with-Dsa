package Cracking_the_Coding_Interview_in_Java_Foundation;

import java.util.ArrayList;

public class _37_Introduction_of_ArrayList_briefly {

    public static void main(String[] args) {


        ArrayList<Integer> l1 =new ArrayList<>();
        ArrayList<Float>   l2 =new ArrayList<>();
        ArrayList<Boolean> l3 =new ArrayList<>();

        // add new elements
        l1.add(5); // 5
        l1.add(6); // 5 6
        l1.add(7); // 5 6 7

        // get an element at Index i
           System.out.println(l1.get(1));  // --> 6

        // print with for loop
        for (int i=0;i<l1.size();i++){

            System.out.print(" "+l1.get(i));  // --> 5,6,7
        }

        System.out.println();

        //printing the array list directly
            System.out.println(l1);

      

    }
}
