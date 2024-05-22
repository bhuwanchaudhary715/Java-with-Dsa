package _2024_May_Recursion_revision;

class naturalNumber{

    public static int naturalSum(int number){

        //base case condition.
        if(number == 1){
            return 1;
        }

        // Recursive condition.
        int result = naturalSum(number-1)+number;

        return result;
    }
}
public class _1st_printing_allNaturalNumSum_1_to_10 {
    public static void main(String[] args) {

        int sumNatural = naturalNumber.naturalSum(10);

        System.out.println("Sum of natural number:"+sumNatural);

    }
}
