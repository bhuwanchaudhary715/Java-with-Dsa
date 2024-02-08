package _237_Reversal_in_an_Array;

    // Time Complexity=O(n)
    // Space Complexity=O(1);

 class Swapping{

   static   int temp=0;
     public static int[] Swap(int array[]) {


         int  n= array.length;
         for (int i = 0; i <n/2;i++){

             temp=array[i];
             array[i]=array[n-i-1];
             array[n-1-i]=temp;
         }

         return array;
     }
 }
public class Reversal_Using_Function {

    public static void main(String[] args) {

        int array[]={2,4,6,8,10,12,14};

          Swapping.Swap(array);

        for(int i=0;i< array.length;i++) {

            System.out.print(array[i]+" ");
        }


    }
}
