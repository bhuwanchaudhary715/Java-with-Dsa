package Recursion_Questions_7_Recursion_on_Strings_Related_problem;

public class _7th_combination_of_keyDigits {

    static void phoneKeyPrint(String digit,String kp[] ,String res){
                   //              "23"        "abc"          ""
        // Base case condition
        if( digit.length() == 0){

            System.out.print(res+" ");
            return;
        }

        int currentNum = digit.charAt(0) - '0'; // 2

        String currentChoice = kp[currentNum];  // abc

        for (int i=0; i<currentChoice.length();i++){

            phoneKeyPrint(digit.substring(1),kp,res+currentChoice.charAt(i));
        }
    }
    public static void main(String[] args) {
        String digits= "23";

      String kp[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

      phoneKeyPrint(digits,kp,"");


    }
}
