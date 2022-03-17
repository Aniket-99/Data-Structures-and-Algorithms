public class ReshapeMatrix {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[][] result = new int[r][c];

        if ((rows * cols) != (r * c)) {
            return mat;
        }

        int colNum = 0;
        int rowNum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[rowNum][colNum] = mat[i][j];
                colNum++;

                if (colNum == c) {
                    colNum = 0;
                    rowNum++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int[][] res = matrixReshape(mat, 1, 4);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j]);
            }
        }
    }
}