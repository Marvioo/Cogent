package Set4;

public class SwapTwoNums {
    public void swap(int[] array, int index1, int index2) {
        array[index1] += array[index2];
        array[index2] = array[index1] - array[index2];
    }
}
