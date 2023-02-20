package Cogent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tools {

    // Find all substrings of String in java program
    public static List<String> findAllSubStrings(String s) {
        List<String> list = new ArrayList<>();
        if(s == null || s.length() == 0) {
            return list;
        }
        char[] array = s.toCharArray();
        for(int i = 0; i < array.length; i++) {
            for(int j = 1; i + j <= array.length; j++) {
                list.add(new String(array, i, j));
            }
        }
        return list;
    }

    // Print reverse string in Java Program
    public static String reverseString(String s) {
        char[] array = s.toCharArray();
        int left =  0;
        int right = array.length - 1;
        while(left < right) {
            swap(array,left++, right--);
        }
        return new String(array);
    }

    private static void swap(char[] array, int index1, int index2) {
        char temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Check given number is palindrome or Not in java Program
    public static boolean isNumberPalindrome(int num) {
        int input = num;
        int newNum = reverseInt(num);
        return input == newNum;
    }

    private static int reverseInt(int num) {
        int result = 0;
        while(num >= 1) {
            result *= 10;
            result += num % 10;
            num /= 10;
        }
        return result;
    }

    // How to add two matrices in java
    public static int[][] matrixAdd(int[][] matrix1, int[][] matrix2) throws WrongInputSizeException{
        int row1 = matrix1.length;
        int row2 = matrix2.length;
        int column1 = matrix1[0].length;
        int column2 = matrix2[0].length;
        if(row1 != row2 || column2 != column1) {
            throw new WrongInputSizeException("Please make sure input matrices have valid sizes for this calculation");
        }

        int[][] result = new int[row1][column1];
        for(int i = 0; i < row1; i++) {
            for(int j = 0; j < row2; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // How to add two matrices in java
    public static int[][] matrixMultiply(int[][] matrix1, int[][] matrix2) throws WrongInputSizeException{
        int row1 = matrix1.length;
        int row2 = matrix2.length;
        int column1 = matrix1[0].length;
        int column2 = matrix2[0].length;
        if(column1 != row2) {
            throw new WrongInputSizeException("Please make sure input matrices have valid sizes for this calculation");
        }

        int[][] result = new int[row1][column2];
        for(int i = 0; i < row1; i++) {
            for(int j = 0; j < column2; j++) {
                result[i][j] = 0;
                for(int k = 0; k < column1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }


        return result;
    }

    public static void showMatrix(int[][] matrix) {
        for(int[] row: matrix) {
            for(int num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // How to replace string with another string in java program
    // unclear requirement
    public static String replace() {

        return null;
    }

    // How to generate random number in Java Program
    public static int generateRandom(int left, int right) {
        Random random = new Random();
        int range = right - left + 1;
        return random.nextInt(range) + left;
    }

    // Binary Search Program
    public static int binarySearch(int[] array, int target) {
        if(array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while(left <= right) {
            int mid = (right - left) / 2 + left;
            if(array[mid] == target) {
                return mid;
            }else if(array[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }


}
