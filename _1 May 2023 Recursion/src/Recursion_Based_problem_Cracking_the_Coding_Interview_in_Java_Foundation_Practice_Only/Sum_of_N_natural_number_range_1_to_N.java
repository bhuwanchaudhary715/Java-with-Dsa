package Recursion_Based_problem_Cracking_the_Coding_Interview_in_Java_Foundation_Practice_Only;

public class Sum_of_N_natural_number_range_1_to_N {

    public static void sumOfNum(int n){

        //Base case condition.
//        if( n==1) {
//
//            System.out.println(n);
//            return;
//        }

        // Or we can write.
        if( n == 0 ) return;

        sumOfNum(n-1);  // <--Recursive call or recursive work.

        System.out.println(n);  // <-- self work.
    }

    public static void main(String[] args) {

       sumOfNum(5);

    }
}
