package Recursion_Based_problem_Cracking_the_Coding_Interview_in_Java_Foundation_Practice_Only;

public class AdvancedMethodOf_P_powOf_Q {

    public static  int Pow(int p, int q){

        // Base case
        if( q == 0 )  return 1;

        if( q % 2 == 0){

            return Pow(p,q/2) * Pow(p,q/2);

        } else {
                                                             // Time complexity of this code is = O (q);
            return Pow(p,q/2) * Pow(p,q/2) * p;
        }
    }
    public static void main(String[] args) {

        System.out.println(Pow(2,3));

    }
}
