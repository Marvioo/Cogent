package cogent;

public class FindTheLargest {
    public static int findLargest(int[] array) {
        int max = Integer.MIN_VALUE;
        for(int num: array) {
            max = Math.max(num, max);
        }
        return max;
    }
}
