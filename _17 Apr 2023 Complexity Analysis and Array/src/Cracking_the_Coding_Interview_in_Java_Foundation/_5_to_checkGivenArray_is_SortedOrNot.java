package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _5_to_checkGivenArray_is_SortedOrNot {

    public static boolean sortedOrNot(int array[]){

        boolean ans= true;
        for(int i=1;i<array.length;i++){

            if(array[i-1] > array[i] ){

                ans=false;
                break;

            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int arr[]={2,3,3,5,6,8,3};
        System.out.println(sortedOrNot(arr));
    }
}
