package Set7;

public class ReverseString {
    public static String reverse(String input) {
        if(input == null || input.length() < 2) {
            return input;
        }
        char[] array = input.toCharArray();
        int left = 0;
        int right = array.length - 1;
        while(left < right) {
            swap(array, left++, right--);
        }
        return new String(array);
    }

    public static void swap(char[] array, int index1, int index2) {
        char temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
