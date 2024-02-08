
package _266_Finding_of_Power_using_Recursion;

import java.util.*;
import java.math.BigInteger;

class BigIntegerFinding{

    // Function definition.
    public static BigInteger PowerFinding( BigInteger a , int b) {

        BigInteger result, finalResult;
        if (b == 1) {               //     <--   Base case condition

            return a;

    }else {

            result = PowerFinding(a,b/2);   // <--  Recursive calls

            finalResult=result.multiply(result);

            if( b % 2 == 0){

                return finalResult;

            }else {

                return a.multiply(finalResult);

            }
        }
    }
}

public class _3rd_Power_program_Efficient_approach_Using_big_Data {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of BigInter A and Int B:");
        BigInteger a=sc.nextBigInteger();
        int b=sc.nextInt();

        BigInteger result =  BigIntegerFinding.PowerFinding(a,b);

        System.out.println("The power of A^B is:"+result);
    }
}
