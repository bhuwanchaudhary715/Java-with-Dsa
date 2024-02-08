package Problems_based_on_Recursion_problem_4;

public class _5th_N_integer_Target_X_print_indices_only_in_Array {

    public static void printIndices(int array[],int target,int idx){

        // Base case condition
        if( idx==array.length-1){

              if(target==array[idx]) {

                  System.out.println(idx);
              }
               return;
        }

        // self work
        if(target==array[idx]) {

            System.out.println(idx);
        }

        // Recursive call or sub-problem .
        printIndices(array,target,idx+1);

    }

    public static void main(String[] args) {

        int array[]= {1,2,3,2,2,5,2,3,2};
        int target=2;
         printIndices(array , target, 0);



    }
}
