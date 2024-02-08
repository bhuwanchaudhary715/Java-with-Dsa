package Recursion_Questions_7_Recursion_on_Strings_Related_problem;

public class _6th_PrintFrogJump_problem {

    static int bestJump(int h[],int n,int idx){

        //Base case condition.
        if( idx == n-1)    return 0;


        int op1 = bestJump(h,n,idx+1) + Math.abs(h[idx]-h[idx+1]);

        if( idx == n-2)   return op1;

        int op2 = bestJump(h,n,idx+2) + Math.abs(h[idx]-h[idx+2]);

        return Math.min(op1,op2);

    }

    public static void main(String[] args) {

        int h[]={10, 30, 40, 20};
        System.out.println(bestJump(h,h.length,0));


    }
}
