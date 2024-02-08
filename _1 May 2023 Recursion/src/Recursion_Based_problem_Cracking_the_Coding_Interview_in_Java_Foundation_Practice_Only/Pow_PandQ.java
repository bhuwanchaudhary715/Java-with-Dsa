package Recursion_Based_problem_Cracking_the_Coding_Interview_in_Java_Foundation_Practice_Only;

public class Pow_PandQ {

    public static int powOfPandQ( int p, int q){

         // base case condition
        if( q==0)  return 1;

               // Recursive work     // self work
        return powOfPandQ(p,q-1)   *   p ;
    }

    public static void main(String[] args) {

        System.out.println(powOfPandQ(25,2));
    }
}
