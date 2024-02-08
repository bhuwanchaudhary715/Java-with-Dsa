package _238_Missing_Number_in_an_Array;

public class MISSING_NUMBER_ARRAY {
   static int mSum=0;
     static void missingNumberInArray(int array[]){

         int n =array.length+1;

         int sum=n*(n+1)/2;

         for(int i=0;i<array.length;i++){

             // mSum+=array[i];
              mSum=mSum+array[i];
         }

         System.out.println(sum-mSum);
     }

    public static void main(String[] args) {

         int array[] ={1,2,3,4,5,7};
         missingNumberInArray(array);


    }
}
