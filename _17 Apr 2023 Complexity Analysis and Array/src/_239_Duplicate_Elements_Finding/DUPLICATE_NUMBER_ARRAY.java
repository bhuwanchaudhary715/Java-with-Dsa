package _239_Duplicate_Elements_Finding;

public class DUPLICATE_NUMBER_ARRAY {
   static    int duplicate=0;
    static int  duplicateNumber(int num[]){


        for (int i=0; i<num.length; i++){

            for (int j=i+1; j<num.length; j++){

                if( num[i] == num[j] ){

                   duplicate=  num[i];

                }
            }
        }
        return duplicate;
    }
    public static void main(String[] args) {

        int nums[]={1,2,3,4,1};
        System.out.println( duplicateNumber(nums));

    }
}
