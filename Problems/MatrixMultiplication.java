package Problems;

public class MatrixMultiplication {

    public static void main(String[] args) {

        int [][] A = {
                {1, 3, 4},
                {3, 2, 1},
                {2, 13, 2},
        };
        int[][] B = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };


        if (A[0].length != B.length){
            System.out.println("Matrixx multiplication is not Possible");
        }

        int [][] result = new int[A.length][B[0].length];

        for (int i = 0; i < A.length;i++){
            for (int j = 0 ; j < B[0].length;j++){
                for (int k = 0 ; k < A[0].length;k++){
                    result[i][j] += A[i][j]*B[k][j];
                }
            }
        }
        System.out.println("Result of matrix multiplication:");
        for (int []row : result){
            for (int val : row){
                System.out.print(val+ " ");
            }
            System.out.println();
        }


    }
}
