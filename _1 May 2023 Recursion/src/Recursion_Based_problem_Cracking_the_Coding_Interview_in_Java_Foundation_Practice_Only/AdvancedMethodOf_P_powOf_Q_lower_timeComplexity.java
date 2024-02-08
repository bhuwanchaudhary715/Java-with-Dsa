package Recursion_Based_problem_Cracking_the_Coding_Interview_in_Java_Foundation_Practice_Only;

public class AdvancedMethodOf_P_powOf_Q_lower_timeComplexity {

    public static  int Pow(int p, int q) {

        // Base case
        if (q == 0) return 1;

        int smallPow=Pow(p,q/2);
        if (q % 2 == 0) {                // Time complexity of this code is = O (log(q);

            return smallPow * smallPow;

         }

        return  smallPow * smallPow * p;
    }

    public static void main(String[] args) {

        System.out.println(Pow(2,4));

    }
}
