
   /*
       Q4. Find out how many pass would be required to sort the following array in decreasing order
           using bubble sort.

       Input Array {3,5,1,6,0}

   */


package Assignment_Sorting_Array;

import java.util.Scanner;

class RequiredToSort{

    public static void printArray(int array[]){

        for(int i=0;i<array.length;i++){

            System.out.print(" "+array[i]);
        }
    }

    public static int bubbleSort(int array[]){

        int count=0;
        for(int i=0;i<array.length;i++){

            for(int j=0;j<array.length-1-i;j++){

                if(array[j] < array[j+1]){

                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                    count++;
                }
            }
        }
        return count;

    }
}

public class _4th_Program {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Array size:");
        int size=sc.nextInt();

        int array[]=new int[size];

        System.out.println("Enter the value array elements ");
        for(int i=0; i<array.length;i++){

            array[i]=sc.nextInt();
        }

        int count = RequiredToSort.bubbleSort(array);

        System.out.println("There are "+count+" times pass");
    }
}
