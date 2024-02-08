package _237_Reversal_in_an_Array;

public class REVERSAL_ARRAY {
    static int  temp=0;
    public static void reversalArray(int array[]){

        int n=array.length;

        for (int i=0;i<n/2;i++){

            temp=array[i];
            array[i]=array[n-i-1];
            array[n-i-1]=temp;
        }

        for (int i=0; i<array.length;i++){

            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {

        int array[]={10,15,20,25,30};

        reversalArray(array);
    }
}
