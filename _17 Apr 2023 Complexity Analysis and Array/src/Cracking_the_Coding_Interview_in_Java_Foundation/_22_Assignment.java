/**
 *
 * Q3. There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
 * The biker starts his trip on point 0 with altitude equal 0.
 * You are given an integer array gain of length n where gain[i] is the net gain in altitude between
 * points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.  ( Medium )
 *
 * Input1:
 * n = 5
 * gain = [-5,1,5,0,-7]
 * Output1:
 * 1
 *
 * Input2:
 * n = 7
 * gain = [-4,-3,-2,-1,4,3,2]
 * Output2:
 * 0
 */

package Cracking_the_Coding_Interview_in_Java_Foundation;

public class _22_Assignment {

    static int returnHighestAltitudeOfAPoint(int gain[]){

        int max=0;  // <-- because of max starting height is 0.

        int current=0; //  <-- because of starting current point is 0.

        for(int i=0;i<gain.length;i++){

            current +=gain[i];

            if( current > max ){

                max=current;
            }
        }

        return max;
    }

    public static void main(String[] args) {


        int gain[]={-5,1,5,0,-7};

        System.out.println(returnHighestAltitudeOfAPoint(gain));
    }
}
