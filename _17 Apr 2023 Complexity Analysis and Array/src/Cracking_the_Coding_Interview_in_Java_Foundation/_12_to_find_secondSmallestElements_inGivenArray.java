package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _12_to_find_secondSmallestElements_inGivenArray {

    public static int printFirstMinElement(int array[]){

        int min=Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++){

            if(array[i] < min){

                min=array[i];
            }
        }
         return min;
    }

    public static int printSecondMinElement(int array[]){

        int min=printFirstMinElement(array);

        for (int i=0;i<array.length;i++){

            if( array[i] == min ){

                array[i]=Integer.MAX_VALUE;
            }
        }

        int secondMin = Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++){

            if(array[i] < secondMin ){

                secondMin=array[i];
            }
        }
        return secondMin;
    }

    public static void main(String[] args) {

        int arr[]={2,-1,0,2,8};
        System.out.println(" Second Smallest min element:"+printSecondMinElement(arr));
    }
}
