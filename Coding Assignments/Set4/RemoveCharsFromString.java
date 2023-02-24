package Set4;

public class RemoveCharsFromString {
    public String remove(String s, char c) {
        if(s == null || s.length() == 0) {
            return s;
        }

        char[] array = s.toCharArray();
        int slow = 0;
        int fast = 0;
        while(fast < array.length) {
            if(array[fast] != c) {
                array[slow++] = array[fast];
            }
            fast++;
        }
        return new String(array, 0 , slow);
    }
}
