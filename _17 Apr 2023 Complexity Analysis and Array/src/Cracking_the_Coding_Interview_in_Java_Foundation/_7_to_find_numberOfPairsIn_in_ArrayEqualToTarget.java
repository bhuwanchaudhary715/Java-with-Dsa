package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _7_to_find_numberOfPairsIn_in_ArrayEqualToTarget {

    public static int printTargetElement(int array[],int target){

        int ans=0;

        for(int i=0;i<array.length;i++){

            for(int j=i+1;j<array.length;j++){

                if(array[i]+array[j] == target){

                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int arr[]={4,6,3,5,8,2};

        System.out.println("The numberOfPairs are:"+printTargetElement(arr,7));

    }
}
