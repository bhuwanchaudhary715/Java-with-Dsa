package Problems_based_on_Recursion_problem_4;

public class _6th_Check_given_array_is_sorted_or_not_using_Recursion {

    public static boolean checkArray_sorted_or_not(int array[],int idx){

        //Base case condition.
        if ( idx  == array.length-1){

            return true ;
        }

        // Self-problem.
        if( array[idx] > array[idx+1]) {

            return false;
        }

       // Recursive case or sub-problem.
       return checkArray_sorted_or_not(array,idx+1);

    }
    public static void main(String[] args) {

        int array[] = { 2,4,6 };

        System.out.println(checkArray_sorted_or_not(array,0));


    }
}
