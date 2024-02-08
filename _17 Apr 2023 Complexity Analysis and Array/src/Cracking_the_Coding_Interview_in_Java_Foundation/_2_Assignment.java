/*
     Q2. Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
         strings stored on odd indices of the array.  (Easy)

         Output:
          bc
          de
          fg

 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _2_Assignment {

    public static void printOddString(String array[]){

        for (int i=0;i<array.length;i++){

            if( i % 2 != 0){

                System.out.println(array[i]+" ");
            }
        }
    }

    public static void main(String[] args) {

        String arr[] = {"ab","bc","cd","de","ef","fg","gh"};

        printOddString(arr);

    }
}
