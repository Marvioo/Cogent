package Set4;

import Cogent.Tools;

public class Tester {
    public static void main(String[] args) {
//        RemoveCharsFromString r = new RemoveCharsFromString();
//        System.out.println(r.remove("abacadaeafag", 'a'));


//        int[] nums = {0,1,2,3,4,5,6};
//        SwapTwoNums swapTwoNums = new SwapTwoNums();
//        swapTwoNums.swap(nums, 0, 5);
//        for(int num: nums) {
//            System.out.print(num+" ");
//        }


//        RemoveWhiteSpacesFromString removeWhiteSpacesFromString = new RemoveWhiteSpacesFromString();
//        System.out.println(removeWhiteSpacesFromString.remove(" a b c   d  e fgh   i   jk   "));

//        CheckIfTwoArrayHasTheSameElements checkIfTwoArrayHasTheSameElements = new CheckIfTwoArrayHasTheSameElements();
//        int[] array1 = {1,2,3,4,5};
//        int[] array2 = {1,2,3,4,7};
//        int[] array3 = {1,2,3,4,7};
//
//        System.out.println(checkIfTwoArrayHasTheSameElements.isSame(array1, array2));
//        System.out.println(checkIfTwoArrayHasTheSameElements.isSame(array3, array2));


//        int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
//        FindThirdLargestElement findThirdLargestElement = new FindThirdLargestElement();
//        System.out.println(findThirdLargestElement.find3rdLargest(num));


        IsValidParenthese is = new IsValidParenthese();
        System.out.println(is.isValid("{[]})"));
        System.out.println(is.isValid("{()}[]"));
    }
}
