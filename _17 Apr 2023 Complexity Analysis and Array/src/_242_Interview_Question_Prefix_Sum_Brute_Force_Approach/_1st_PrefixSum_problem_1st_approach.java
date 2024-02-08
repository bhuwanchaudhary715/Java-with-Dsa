package _242_Interview_Question_Prefix_Sum_Brute_Force_Approach;

public class _1st_PrefixSum_problem_1st_approach {

    public static void main(String[] args) {

        int array[]={2,4,6,8,10};

        for(int i=1;i< array.length;i++){

            array[i]+=array[i-1];
        }

        for(int i=0;i< array.length;i++){

            System.out.print(array[i]+" ");
        }
    }

}
