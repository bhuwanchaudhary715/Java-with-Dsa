package Recursion_Questions_7_Recursion_on_Strings_Related_problem;

public class _4th_PrintSubSequence_Good_Approach {

    static void printSubsequence(String s, String currSubSequence){
                               //    "abc"          ""

        // Base case condition.
        if(s.length() == 0){

        System.out.println(currSubSequence);
            return;
        }

        char curr = s.charAt(0); // "a"
        String remainString = s.substring(1); //"bc"


        // Curr char --> choose to be a part of currSubsequence
        printSubsequence(remainString,currSubSequence+curr); // bc , a          //  <-- add curr or include curr

        // Curr char --> does not choose to be a part of currSubsequence
        printSubsequence(remainString,currSubSequence);  // bc,""                            //  <-- don't add curr or not include curr

    }

    public static void main(String[] args) {

        printSubsequence("abc","");


    }
}
