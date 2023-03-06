package cogent;

import java.util.Arrays;

public class CopyAllTheElements {
    // WAP to copy all the elements of one array to another array
    public static int[] copy(int[] array) {
        return Arrays.copyOf(array, array.length);
    }
}
