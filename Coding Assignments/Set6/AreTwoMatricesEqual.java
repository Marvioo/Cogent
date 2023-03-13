package Set6;

public class AreTwoMatricesEqual {
    // 4. WAP to check whether 2 matrices are equal or not
    public static boolean areEqual(int[][] matrix1, int[][] matrix2) {
        if(matrix1 == null && matrix2 == null) {
            return true;
        } else if(matrix1 == null || matrix2 == null || matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return  false;
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
