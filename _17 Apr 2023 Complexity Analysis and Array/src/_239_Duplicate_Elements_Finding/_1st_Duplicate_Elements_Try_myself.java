package _239_Duplicate_Elements_Finding;

public class _1st_Duplicate_Elements_Try_myself {

    public static void main(String[] args) {

        int array[]={1,2,2,3,5};

        // Time Complexity =O(n^2) Because of 2 loop.
        // Space Complexity =O(1) --> Constant ( because of i am not using Extra space )

        for(int i=0;i<array.length;i++){

            for(int j=1+i; j<array.length;j++) {

                if (array[i] == array[j]) {

                    System.out.println("Duplicate Elements is:"+array[i]);

                }
            }
        }
    }
}
