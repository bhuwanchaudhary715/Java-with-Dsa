package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _13_SwapTwoNumberUsingTemp {

    public static void printSwapTwoNum(int a,int b){

        System.out.println("Before Swapping a:"+a);
        System.out.println("Before Swapping b:"+b);

           int temp =a;
               a=b;
               b=temp;

        System.out.println("After Swapping a:"+a);
        System.out.println("After Swapping b:"+b);

    }

    public static void main(String[] args) {

        int a=2;
        int b=3;

        printSwapTwoNum(a,b);
    }
}
