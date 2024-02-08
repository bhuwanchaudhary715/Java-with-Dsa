package _282_Examples_Of_Backtracking;

import java.util.*;

public class _2nd_Example_program {

    public static  void subSequence(int arr[] , int idx , ArrayList<Integer> tempArray){

        // Base case condition
        if( idx == arr.length){

            //  print all the sequences -- but do not print empty entries
            if( tempArray.size() > 0){

                System.out.println(tempArray);
            }
            return;
        }

        // Recursive call
        // include
//        subSequence(arr,idx+1,tempArray);

        //add the value in the tempArray
        tempArray.add(arr[idx]);



        // Recursive call
        // Not include
        subSequence(arr,idx+1,tempArray);

        //remove the value from tempArray -- backtracking
        tempArray.remove(tempArray.size()-1);
    }

    public static void main(String[] args) {


        int arr[]={ 1 ,2 ,3 };

        subSequence(arr,0,new ArrayList<Integer>() );

    }
}
