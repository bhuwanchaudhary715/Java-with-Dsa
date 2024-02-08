package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _3_to_find_number_occurrenceInGivenArray {

    public static void numberOccurrence(int array[],int x){

        int ans=0;

        for (int i=0;i<array.length;i++){

            if( array[i] == x){

                ans ++;
            }
        }

        System.out.println("The number of Occurrence in x Elements in array are:"+ans);
    }

    public static void main(String[] args) {

        int arr[]={1,5,6,8,5,5};

        numberOccurrence(arr,5);

    }
}
