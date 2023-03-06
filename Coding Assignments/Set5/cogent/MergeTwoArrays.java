package cogent;

import java.util.Arrays;

public class MergeTwoArrays {
    // 7 WAP to merge 2 sorted arrays
    // ascending
    public static int[] mergeTwoSortedArrays(int[] array1, int[] array2) {
        if(array1 == null || array2 == null) {
            return array1 == null ? array2 : array1;
        }

        int[] result = new int[array1.length + array2.length];
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        while(index1 < array1.length && index2 < array2.length) {
            if(array1[index1] <= array2[index2]) {
                result[index++] = array1[index1++];
            } else {
                result[index++] = array2[index2++];
            }
        }

        if(index1 == array1.length) {
            for(int i = index2; i < array2.length; i++) {
                result[index++] = array2[i];
            }
        } else {
            for(int i = index1; i < array1.length; i++) {
                result[index++] = array1[i];
            }
        }
        return result;
    }
}
