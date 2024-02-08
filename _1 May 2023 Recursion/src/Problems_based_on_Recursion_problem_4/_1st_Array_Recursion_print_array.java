package Problems_based_on_Recursion_problem_4;

public class _1st_Array_Recursion_print_array {

    public static void printArray(int array[],int ixd){

        // Base case
        if(ixd == array.length){

            return;
        }

        // Self work
        System.out.print(" "+array[ixd]); // <-- 5

        // Recursive work or recursive calls
        printArray(array,ixd+1);    //  <-- 7,8,9

    }

    public static void main(String[] args) {

        int array[]={5,7,8,9};

        printArray(array,0);


    }
}
