package Set6;

public class InterchangeAcrossColumns {
    // 12.WAP to Interchange Elements of First and Last in a Matrix Across Columns
    public static void interchangeAcrossColumns(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int last = matrix[0].length - 1;
        for(int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][last];
            matrix[i][last] = temp;
        }
    }
}
