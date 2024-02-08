package Problems_based_on_Recursion_problem_4;

public class _7th_print_last_index_0nly_inGivenArray {

    public static void findLastIndex(int array[],int target,int idx){

        // Base case condition.
        if( idx == 0 ){

            if( array[idx]==target){

                System.out.println(idx);
            }
            return;
        }

        // Self work.
        if( target == array[idx]){

            System.out.println(idx);
            return;
        }

        findLastIndex(array,target,idx-1);
    }

    public static void main(String[] args) {

        int array[] = {1,2,3,2,2,5};
        int n=array.length-1;
        int target=2;

        findLastIndex(array,target,n);

    }
}
