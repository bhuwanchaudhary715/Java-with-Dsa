package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _4th_to_find_lastOccurrenceOfElement_inGiven_Array {

    public static int  lastOccurrence(int array[],int x){

        int lastIndex = -1;
        for (int i=0;i<array.length;i++){

            if( array[i] == x){

                lastIndex= i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {


        int arr[]={5,6,5,3,5,4};

        System.out.println(lastOccurrence(arr,5));
    }
}
