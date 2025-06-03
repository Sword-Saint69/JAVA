package DSA;

public class TransposeofMatrix {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        int[][] transposed = transposeofMatrix(arr);

        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] transposeofMatrix(int[][] arr) {

        int row = arr.length;
        int col = arr[0].length;
        int[][] matrix = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = arr[j][i];
            }
        }

        return matrix;
    }
}
