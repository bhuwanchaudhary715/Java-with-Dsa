package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _1_to_find_maximum_element_in_array {

    public static int maxElement(int array[]){

        int ans=0;

        for(int i=0;i<array.length;i++){

            if(ans < array[i]){

                ans=array[i];

            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int arr[]={55,8,9,25};

        System.out.println(maxElement(arr));

    }
}
