package Problems_based_on_Recursion_problem_4;

import java.util.ArrayList;

public class _5th_N_integer_Target__X_print_indices_0nly_using_ArrayList {

    public static ArrayList<Integer> search(int array[],int n,int x,int idx){

        ArrayList<Integer> ans =new ArrayList<>();

        // Base condition
        if( idx >= n){

            return ans;
        }

        // Self work.
        if( x == array[idx]){

            ans.add(idx);
        }

        // Recursive work or Sub-problem
        ArrayList<Integer> smallAns = search(array,n,x,idx+1);
        ans.addAll(smallAns);

        return ans;
    }

    public static void main(String[] args) {

        int array[] = {1,2,3,2,2,5};

        int n = array.length;
        int x = 2;

        System.out.println(search(array,n,x,0));
    }
}
