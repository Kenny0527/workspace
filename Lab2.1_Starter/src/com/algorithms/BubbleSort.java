package com.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
       int[] input = {4, 15, 2, 6, 9, 22, 13};
       System.out.println(Arrays.toString(input));
       sort(input);
       System.out.println(Arrays.toString(input));
    }

    public static int[] sort(int[] numbers){
       // TODO-Lab2.1: implement pseudo-code above
        if(numbers == null) {
            System.out.println("The input array is empty");
            return null;
        }
        int last = numbers.length;
        boolean isSorted = false;
        for(int k = 1; k < last; k++){
            for(int j = 0; j < last - 1; j++){
                if(numbers[j] > numbers[j + 1]){
                    swap(numbers, j, j + 1);
                }

            }
        }
        return numbers;
    }

    private static void swap(int[] numbers, int index1, int index2){
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
    
}
