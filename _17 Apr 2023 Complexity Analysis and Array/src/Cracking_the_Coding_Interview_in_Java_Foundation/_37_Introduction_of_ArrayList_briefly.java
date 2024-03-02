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
        System.out.println(l1); // [ 5 6 7 ]


        // adding element at some index i
        l1.add(1,200);
        System.out.println(l1);     //  [ 5 200 6 7 ]

        // modifying element at index i
         l1.set(1,20);
        System.out.println(l1);     //  [ 5 20 6 7 ]

        // removing element at index i
        l1.remove(1);
        System.out.println(l1);     // [ 5 6 7 ]

        // removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);     //  5  6

        // checking if an element exit
         boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);    // True


        // if you don't specify class , you can put anything inside --> 'l1'

        ArrayList l = new ArrayList();
        l.add("Bhuwan");
        l.add(7);
        l.add(true);
        l.add(7.5);

        System.out.println(l);  // [  Bhuwan 7 true 7.5 ]



    }
}
