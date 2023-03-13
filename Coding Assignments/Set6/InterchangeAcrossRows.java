package Set6;

public class InterchangeAcrossRows {
    // 11.WAP to Interchange Elements of First and Last in a Matrix Across Rows
    public static void interchangeAcrossRows(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int last = matrix.length - 1;
        for(int i = 0; i < matrix[0].length; i++) {
            int temp = matrix[0][i];
            matrix[0][i] = matrix[last][i];
            matrix[last][i] = temp;
        }
    }
}
