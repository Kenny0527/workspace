package com.algorithms;

public class BinarySearch {
    public static boolean binarySearch(int target, int[] sortedArray) {
        return binarySearch(target, sortedArray, 0, sortedArray.length - 1);
    }

    private static boolean binarySearch(int target, int[] array, int start, int end) {

        // TODO-Lab2.2: Implement binary search logic here using recursion
        if(start <= end){
            int mid = midpoint(start, end);
            if(array[mid] == target){
                return true;
            }
            else if(array[mid] > target){
                return binarySearch(target, array, start, mid - 1);
            }else {
                return binarySearch(target, array, mid + 1, end);
            }
        }
        return false;
    }

    private static int midpoint(int start, int end){
        return start + ((end - start) / 2);
    }

    public static void main(String[] args) {
        int[] sorted = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        System.out.println("The target search returned: " + binarySearch(target, sorted));

    }
}

