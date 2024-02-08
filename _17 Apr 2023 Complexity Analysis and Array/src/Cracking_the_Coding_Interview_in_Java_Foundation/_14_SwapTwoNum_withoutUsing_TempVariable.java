package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _14_SwapTwoNum_withoutUsing_TempVariable {

    public static void printSwapTwoInteger_without_Temp(int a,int b){

        System.out.println("Before Swapping a:"+a);
        System.out.println("Before Swapping b:"+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swapping a:"+a);
        System.out.println("After Swapping b:"+b);

    }
    public static void main(String[] args) {

        int a=2;
        int b=3;
        printSwapTwoInteger_without_Temp(a,b);
    }
}
