package Recursion_Based_problem_Cracking_the_Coding_Interview_in_Java_Foundation_Practice_Only;

public class _Sum_Of_natural_number_With_alternate_sign {

    public static int alternateSign(int n){

        // base case condition
        if( n == 0) return 0;

        // recursive call
        int smallAns=alternateSign(n-1);

        if( n%2==0){  // even case

            return smallAns-n;

        }else {   // odd case

            return smallAns +n;
        }
    }

    public static void main(String[] args) {

        System.out.println(alternateSign(4));
    }
}
