package Set6;

public class AddTwoMatrices {
    // 2.WAP to add 2 matrices
    public static int[][] matrixAdd(int[][] matrix1, int[][] matrix2) throws WrongInputSizeException{
        int row1 = matrix1.length;
        int row2 = matrix2.length;
        int column1 = matrix1[0].length;
        int column2 = matrix2[0].length;
        if(row1 != row2 || column2 != column1) {
            throw new WrongInputSizeException("Please make sure input matrices have valid sizes for this calculation");
        }

        int[][] result = new int[row1][column1];
        for(int i = 0; i < row1; i++) {
            for(int j = 0; j < row2; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
