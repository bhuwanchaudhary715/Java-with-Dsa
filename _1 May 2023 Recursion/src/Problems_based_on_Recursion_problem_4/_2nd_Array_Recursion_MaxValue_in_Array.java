package Problems_based_on_Recursion_problem_4;

 public class _2nd_Array_Recursion_MaxValue_in_Array {

    public static int printMaxValue(int array[],int idx){


        // Base case condition.
        if( idx == array.length-1){

            return array[idx] ;
        }

        // Recursive work or Recursive call

        // small problem --> idx+1, end of the array --> Max --> through Recursion
        int smallAns = printMaxValue(array,idx+1);

        // self work and final ans.
        return Math.max(array[idx],smallAns);
    }

    public static void main(String[] args) {

        int array[]={3,10,3,6,55};

        System.out.println( printMaxValue(array,0));

    }
}
