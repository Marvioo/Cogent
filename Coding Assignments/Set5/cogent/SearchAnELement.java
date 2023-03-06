package cogent;

public class SearchAnELement {
    public static int binarySearch(int[] array, int element) {
        if(array == null || array.length == 0) {
            return -1;
        }

        int left = 0;
        int right = array.length - 1;
        while(left <= right) {
            int mid = (right - left) / 2 + left;
            if(array[mid] == element) {
                return mid;
            } else if (array[mid] < element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
