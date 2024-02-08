package _249_Searching_Binary_Search;

import java.util.Scanner;

public class _1st_Binary_Search {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array:");     // Time Complexity= o(log(n))
        int n = sc.nextInt();                                 // Space Complexity=O(1)

        int array[] = new int[n];

        System.out.println("Enter the array elements Matrix:");
        for (int i = 0; i < array.length; i++) {

            array[i] = sc.nextInt();
        }

        System.out.println("Enter the target Elements:");
        int target = sc.nextInt();

        int low = 0, high = n - 1, mid = 0 , success=-1;

        while (low <= high) {

            mid = (low + (high-low)) / 2;

            if (array[mid] == target) {

               success=1;
                break;

            } else if (array[mid] < target) {

                low = mid + 1;

            } else {

                high = mid-1;            }
        }

        if( success == 1){

            System.out.println("Given array elements is not Found in any Index:");

        }else {

            System.out.println("Given array element is Found in Index:"+mid);
        }

    }

}
