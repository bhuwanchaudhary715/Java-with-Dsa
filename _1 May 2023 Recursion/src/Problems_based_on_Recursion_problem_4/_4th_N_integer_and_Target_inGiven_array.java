package Problems_based_on_Recursion_problem_4;

public class _4th_N_integer_and_Target_inGiven_array {

    public static int nIntegerTarget(int array[],int target,int idx){

        // Base case condition
        if( idx==array.length-1){

            return array[idx];
        }

          // self work
        if(target==array[idx]) {

            return array[idx];
        }

        // Recursive call or sub-problem .
        return nIntegerTarget(array,target,idx+1);
    }
    public static void main(String[] args) {

        int array[]= {4,6,8};
        int target=2;
        int result=nIntegerTarget(array,target,0);

        if(result == target){

            System.out.println("Yes");
        }else {

            System.out.println("NO");
        }


    }
}
