package com.cogent.tools;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tools {
	// Find bigger number among two
	public static int findBigger(int num1, int num2) {
		return Math.max(num1, num2);
	}
	
	// Swap two number
	public static void swapTwoNumber(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
	
	// Swap two numbers without using extra variables 
	public static void swapTwoNumberWithoutUsingExtraVars(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
	}
	
	// Check number is even or odd using ternary operator
	public static boolean isOdd(int num) {
		return num % 2 == 0 ? false : true;
	}
	
	// Find Bigger number among three numbers
	public static int biggestAmongThreeNums(int a, int b, int c) {
		return Math.max(a, Math.max(c, b));
	}
	
	// Find a character is vowel or consonant
	public static void isVowel(char ch) {
		if(!(ch <= 90 && ch >= 65 || ch <= 122 && ch >= 97)) {
			System.out.println("invalid input");
			return;
		}
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
				|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println("the input character is vowel");
		} else {
			System.out.println("the input character is consonant");
		}
	}
	
	// Write a method that accepts an array and return the second min and max number.
	public static int[] findSecondMaxAndMin(int[] array) {
		if(array == null || array.length < 2) {
			return new int[] {-1, -1};
		}
		
		Arrays.sort(array);
		return new int[] {array[1], array[array.length - 2]};
	}
	
	// Write a method that accepts two string arguments and 
	// returns true if they are anagram and false if they are not.
	public static boolean isAnagram(String s1, String s2) {
		if(s1 == null && s2 == null) {
			return true;
		}
		
		
		if(s1 == null || s2 == null || s1.length() != s2.length()) {
			return false;
		}
		
		Map<Character, Integer> map1 = makeMap(s1);
		Map<Character, Integer> map2 = makeMap(s2);
		return map1.equals(map2);
	}
	
	public static Map<Character, Integer> makeMap(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for(char ch: s.toCharArray()) {
			Integer i = map.get(ch);
			if(i == null) {
				map.put(ch, 1);
			}else {
				map.put(ch, i + 1);
			}
 		}
		
		return map;
	}
	

}
