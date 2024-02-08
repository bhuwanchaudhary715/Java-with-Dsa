package Problems_based_on_Recursion_problem_4;

public class _4th_N_integer_and_Target_in_Given_array_Lecture_method {

    public static boolean nIntegerTarget(int array[], int target, int idx) {

        // Base case condition
        if (idx == array.length) {

            return false;
        }

        // Self work
        if (target == array[idx]) {

            return true;
        }

        //  Recursive call or recursive work.
        return nIntegerTarget(array, target, idx + 1);


    }

    public static void main(String[] args) {

        int array[] = {4, 6, 8};
        int target = 8;


        if (nIntegerTarget(array, target, 0)) {

            System.out.println("Yes");
        } else {

            System.out.println("NO");
        }

    }
}