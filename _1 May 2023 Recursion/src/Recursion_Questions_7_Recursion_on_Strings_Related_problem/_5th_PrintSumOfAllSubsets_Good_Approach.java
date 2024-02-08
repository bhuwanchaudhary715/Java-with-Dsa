package Recursion_Questions_7_Recursion_on_Strings_Related_problem;

public class _5th_PrintSumOfAllSubsets_Good_Approach {

    static void printSumAllSubsets(int array[],int currSubsequence,int idx){


        // Base case condition
        if(idx >= array.length){

            System.out.println(currSubsequence);
            return;
        }

        int curr=array[idx];

        printSumAllSubsets(array,currSubsequence+curr,idx+1); // Include

        printSumAllSubsets(array,currSubsequence,idx+1); // not include
    }


    public static void main(String[] args) {

        int arr[]={2,3};
        printSumAllSubsets(arr,0,0);


    }
}
