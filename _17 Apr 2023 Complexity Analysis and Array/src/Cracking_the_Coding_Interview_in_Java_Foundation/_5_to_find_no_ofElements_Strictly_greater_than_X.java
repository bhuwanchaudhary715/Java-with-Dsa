package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _5_to_find_no_ofElements_Strictly_greater_than_X {

    public static int printStrictlyGreater(int array[],int x){

        int count=0;
        for(int i=0;i<array.length;i++){

            if(array[i] > x){

                count++;
            }
        }
        return count ;
    }

    public static void main(String[] args) {

        int arr[]={4,5,9,8,7,3};

        System.out.println( printStrictlyGreater(arr,5));


    }
}
