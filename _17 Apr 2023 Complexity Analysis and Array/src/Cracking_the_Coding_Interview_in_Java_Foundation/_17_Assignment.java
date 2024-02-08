
/*
   Q3. You are given an integer array height of length n. There are n vertical lines drawn such that the
       two endpoints of the ith line are (i, 0) and (i, height[i]).
       Find two lines that together with the x-axis form a container, such that the container contains
       the most water.
       Return the maximum amount of water a container can store.         ( Medium )

       Input1:
              n = 9
              height = [1,8,6,2,5,4,8,3,7]
       Output1:
               49

       input2:
              n = 2
              height = [1,1]
       Output2:
               1

 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _17_Assignment {

    public static int returnMaximumAmountOfWater(int height[]){

        int left=0;
        int right=height.length-1;
        int ans=0;

        while (left < right ){

            ans= Math.max(Math.min(height[left],height[right])*(right-left),ans);

            if( height[left] < height[right]){

                left++;

            }else {

                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int height[]={1,8,6,2,5,4,8,3,7};

        int ans=returnMaximumAmountOfWater(height);

        System.out.println(ans);



    }
}
