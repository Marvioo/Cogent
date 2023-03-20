package Set7;

public class ToggleString {
    public static String toggle(String input) {
        if(input == null || input.length() == 0) {
            return null;
        }

        char[] array = input.toCharArray();
        for(int i = 0; i < array.length; i++)  {
            if(Character.isLowerCase(array[i])) {
                array[i] = (char)(array[i] - 'a' + 'A');
            } else {
                array[i] = (char)(array[i] - 'A' + 'a');
            }
        }
        return new String(input);
    }
}
