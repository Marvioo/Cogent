package cogent;

public class CheckIfTwoArraysAreEqualOrNot {
    // 8 WAP to check if two arrays are equal or not
    public static boolean check(int[] array1, int[] array2) {
        if(array1 == null && array2 == null) {
            return true;
        }

        if(array1.length != array2.length) {
            return false;
        }

        for(int i = 0; i < array1.length; i++) {
            if(array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}