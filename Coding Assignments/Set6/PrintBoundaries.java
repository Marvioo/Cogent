package Set6;

public class PrintBoundaries {
    // 8. WAP to print the boundary of a matrix
    public static void PrintBoundaries(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(i == 0 || j == 0 || i == matrix.length - 1 || j == matrix[0].length - 1) {
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print(' ');
                }
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
