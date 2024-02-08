package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _19_to_AdvanceApproach_sortAnArray_ConsistingOfOnly_0s_1s {


    // This method is print only Array Elements .

    static  void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);

        }
    }

    // Swap the both sides elements
    static void swapArrayElements(int arr[],int i,int j ){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }

    // return the printSorted Array
    public static int [] printSortedArray(int arr[]){

        int left=0;
        int right=arr.length-1;

        while ( left < right){



            if( arr[left] == 1 && arr[right] == 0){

                swapArrayElements(arr,left,right);
                left++;
                right--;

            }

            if(arr[left] == 0 ){

                left++;
            }

            if(arr[right] == 1){

                right--;

            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int arr[]={1,0,1,1,0,1,0,0,0};

        printSortedArray(arr);

        printArray(arr);
    }
}
