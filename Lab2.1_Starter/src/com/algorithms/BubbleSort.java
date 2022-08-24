package com.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
       int[] input = {4, 15, 2, 6, 9, 22, 13};
       System.out.println(Arrays.toString(input));
       bubbleSort(input);
       System.out.println(Arrays.toString(input));
    }

    /*
    bubbleSort(array)
       n = length(array)
       for (k = 1 until n)
         for (j = 0 until length-1)
           if(array[j] > array[j + 1])
             swap(array, j, j + 1)
    */
    public static void bubbleSort(int[] numbers){
       // TODO-Lab2.1: implement pseudo-code above
        int last = numbers.length;
        for(int k = 1; k < last; k++){
            for(int j = 0; j < last - 1; j++){
                if(numbers[j] > numbers[j + 1]){
                    swap(numbers, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] numbers, int index1, int index2){
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
    
}
