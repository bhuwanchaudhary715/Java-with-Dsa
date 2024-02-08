package _241_Interview_Question_Rotation_of_Matrix;

public class ROTATION_OF_2D_MATRIX_ARRAY {

    public static void rotatingMatrix(int array[][]){

        int temp=0;

        // 1. Transpose the matrix from row to column
        for (int i=0;i<array.length;i++){

            for(int j=i;j<array[i].length;j++){

                temp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=temp;
            }
        }


        // 2. Swap the left column and right column

        for (int i=0;i< array.length;i++){

            int li=0;
            int ri= array[i].length-1;

            while (li < ri ){

                temp=array[i][li];
                array[i][li]=array[i][ri];
                array[i][ri]=temp;

                li++;
                ri--;
            }
        }

        //  Print the Matrix
        for (int i=0;i<array.length;i++){

            for(int j=0;j<array[i].length;j++){


                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {


         int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

            rotatingMatrix(arr);
    }
}
