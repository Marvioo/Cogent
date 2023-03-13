package Set6;

public class Print2DArray {
    // 1. WAP to Print a 2D Array
    public static void print2dArray(int[][] array) {
        if(array == null) {
            return;
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
