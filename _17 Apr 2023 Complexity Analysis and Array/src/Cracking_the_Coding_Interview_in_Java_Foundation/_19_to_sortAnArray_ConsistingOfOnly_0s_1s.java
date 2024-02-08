package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _19_to_sortAnArray_ConsistingOfOnly_0s_1s {


    // This method is print only Array Elements .

    static  void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);

        }
    }

    public static int[]  printSortedArray(int arr[]){

        int zeros=0;

        for(int i=0;i<arr.length;i++){

            if( arr[i]==0){

              zeros++;

            }
        }


        for(int i=0;i<arr.length;i++){

           if( i < zeros){

               arr[i]=0;

           }else {

               arr[i]=1;
           }
        }
        return arr;
    }

    public static void main(String[] args) {

        int arr[]={1,0,0,1,0,1,1,0,0};

        printSortedArray(arr);
        printArray(arr);

    }
}
