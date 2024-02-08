package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _8_to_find_CountNumberOf_tripletWhoseSumToTarget {

    public static int printTripletPairs(int array[],int target){

        int ans=0;

        for(int i=0;i<array.length;i++){

            for(int j=i+1;j<array.length;j++){

                for(int k=j+1;k<array.length;k++){

                    if( array[i]+array[j]+array[k] == target){

                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int arr[]={1,4,5,6,3};

        System.out.println("The triplet sum pairs are:"+printTripletPairs(arr,12));
    }
}
