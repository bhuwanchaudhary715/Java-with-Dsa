package Problems_based_on_Recursion_problem_4;

public class _3rd_Array_Recursion_Sum_of_all_digits_in_given_array {

    public static int sumOfDigits(int array[],int idx){

        //Base case condition.
//        if( idx == array.length-1 ){
//
//            return array[idx];
//        }

        if( idx == array.length){

            return 0;
        }

        // Recursive work or Sub-problem.
        int smallAns= sumOfDigits(array,idx+1);

                           // Self work.
        return smallAns  +  array[idx];

    }

    public static void main(String[] args) {

        int array[]={ 1,2,3,4,5};

        System.out.println(sumOfDigits(array,0));
    }
}
