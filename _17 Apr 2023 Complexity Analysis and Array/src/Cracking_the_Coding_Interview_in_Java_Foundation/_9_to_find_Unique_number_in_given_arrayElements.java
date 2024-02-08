package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _9_to_find_Unique_number_in_given_arrayElements {

    static void printUniqueNumber(int array[]){

        for(int i=0;i<array.length;i++){

            for(int j=i+1;j<array.length;j++){

                if( array[i] ==array[j] ){

                    array[i]=-1;
                    array[j]=-1;
                }
            }
        }

        for(int i=0;i<array.length;i++){

            if( array[i] > 0){

                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,3,2,1,4};

         printUniqueNumber(arr);
    }
}
