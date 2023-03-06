package cogent;

import java.util.Arrays;

public class RemoveAllOcurrences {
    // 9 WAP to remove all occurrences of an element of an Array
    public static int[] remove(int[] array, int val) {
        int left = 0;
        int right = 0;
        while(right < array.length) {
            if(array[right] != val) {
                array[left++] = array[right];
            }
            right++;
        }
        return Arrays.copyOf(array, left);
    }
}
