package cogent;

public class ArrayRotation {
    public static void rotateArray(int[] array) {
        if(array == null || array.length == 0) {
            return;
        }
        int left = 0;
        int right = array.length - 1;

        while(left < right) {
            swap(array, left++, right--);
        }
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
