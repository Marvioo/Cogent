package cogent;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 6 WAP write a program to remove duplicate elements from an array
// removing without changing the original order of the array
public class RemoveDuplicates {
    public static int[] removeDuplicate(int[] array) {
        Set<Integer> set = new HashSet<>();
        int left = 0;
        int right = 0;
        while(right < array.length) {
            if(set.add(array[right])) {
                array[left++] = array[right++];
            } else {
                right++;
            }
        }
        return Arrays.copyOf(array, left);
//        int[] result = Arrays.copyOf();
    }
}
