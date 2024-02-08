package _241_Interview_Question_Rotation_of_Matrix;

public class ADVANCED_APPROACH_ROTATING_MATRIX {

    public static void rotatingMatrix(int array[][]){

//        for (int i=0;i<array.length;i++){
//
//            for(int j=0;j<array[i].length;j++){
//
//                int temp=array[i][j];
//                array[i][j]=array[j][i];
//                array[j][i]=temp;
//            }
//        }

        for (int i=0;i<array.length;i++){

            for(int j=array.length-1;j>=0;j--){

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
