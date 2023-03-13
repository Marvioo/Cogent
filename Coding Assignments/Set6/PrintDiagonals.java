package Set6;

public class PrintDiagonals {
    // 10. WAP to compute the Sum of Diagnals of a matrix
    public static int SumOfDiagonals(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < Math.min(matrix.length, matrix[0].length); i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
