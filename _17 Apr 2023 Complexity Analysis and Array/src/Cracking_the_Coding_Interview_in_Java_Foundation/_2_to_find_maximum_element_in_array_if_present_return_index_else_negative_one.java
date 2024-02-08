package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _2_to_find_maximum_element_in_array_if_present_return_index_else_negative_one {

    public static int returnIndex(int array[],int x){

        for(int i=0;i<array.length;i++){

            if( array[i]== x){

                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[]={2,5,8,6,2};

        System.out.println(returnIndex(arr,2));

    }
}
