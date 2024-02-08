package Cracking_the_Coding_Interview_in_Java_Foundation;

 public class _11_to_find_first_repeatingValue_in_Given_array {

    public static int printFirstRepeatingValue(int array[]){


        for(int i=0;i<array.length;i++){

            for( int j=i+1;j<array.length;j++){

                if( array[i] == array[j] ){

                    return array[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        int arr [] = { 1,2,4,6,7 };

        System.out.println("First Repeating value:-"+printFirstRepeatingValue(arr));
    }
}
