package Arrays_2D;

public class TransposeInPlace {

    public static int[][] transposInPlace(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;


        for(int i=0; i<c; i++) {
            for(int j=i; j<r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matrix Before Transpose: ");
        printMatrix(matrix);

        int[][] ans = transposInPlace(matrix);

        System.out.println("Matrix After Transpose: ");
        printMatrix(ans);
    }
}
