package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _20_to_printArrayIn_StartingEvenOrder_to_LastOrder {

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

    public static int[] printFirstEvenInteger_toLastInteger(int arr[]){

        int i=0;
        int j=arr.length-1;

        while (i < j) {



            if( arr[i] % 2 ==0){

                i++;
            }

            if( arr[j] %2 !=0){

                j--;
            }

            if( arr[i] % 2 !=0 && arr[j] % 2 ==0){

                swapArrayElements(arr,i,j);
                i++;
                j--;

            }
        }
        return arr;
    }


    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};

        printFirstEvenInteger_toLastInteger(arr);

        printArray(arr);

    }
}
