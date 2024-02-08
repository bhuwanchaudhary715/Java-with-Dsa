
   /*Q1: Take m and n input from the user and m * n integer inputs from user and print the following:    (Easy)

        number of positive numbers
        number of negative numbers
        number of odd numbers
        number of even numbers
        number of ZeroNum(0).

   */


package _2D_Array_Assignments;

   import java.util.Scanner;

   public class _1st_Program {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);
                                                                                // Time Complexity= O(m*n)
        System.out.println("Enter the Size of Row And Column:");                // Space Complexity= O(1)
        int m=sc.nextInt();
        int n=sc.nextInt();

        int array[][]=new int[m][n];

        System.out.println("Enter the Matrix elements:");
        for(int i=0;i<array.length;i++){       // -->  Row

            for(int j=0;j<array.length;j++){  // --> Column

                array[i][j]=sc.nextInt();
            }
        }

        int positiveNum=0;
        int negativeNum=0;
        int oddNum=0;
        int evenNum=0;
        int zeroNum=0;

        for(int i=0;i<array.length;i++){         // --> Row

            for(int j=0;j<array[0].length;j++){  // --> Column

                if(array[i][j]>0)
                    positiveNum++;

                if(array[i][j]<0)
                    negativeNum++;

                 if (array[i][j]%2!=0)
                    oddNum++;

                 if(array[i][j]%2==0)
                    evenNum++;

                 if(array[i][j]==0)
                    zeroNum++;

            }
        }

        System.out.println("number of positive numbers:"+positiveNum);

        System.out.println("number of negative numbers:"+negativeNum);

        System.out.println("number of odd numbers:"+oddNum);

        System.out.println("number of even numbers:"+evenNum);

        System.out.println("Number of Zero Number:"+zeroNum);


    }
}
