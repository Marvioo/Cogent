package Set4;

public class CheckIfTwoArrayHasTheSameElements {
    public boolean isSame(int[] array1, int[] array2) {
        if(array1.length != array2.length) {
            return false;
        }

        int index = 0;
        while(index < array1.length) {
            if(array1[index] != array2[index]) {
                return false;
            }
            index++;
        }
        return true;
    }
}

