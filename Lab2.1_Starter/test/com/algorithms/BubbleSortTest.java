package com.algorithms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {
    // TODO-Lab2.1: Implement tests
    @Test
    public void sortUnsortedArray(){
        int[] array = {3, 5, 1, 7, 12, 15, 6, 4};
        int[] array2 = {3, 5, 1, 7, 12, 15, 6, 4};
        Arrays.sort(array);
        assertArrayEquals(array, BubbleSort.sort(array2));
    }

    @Test
    public void sortNullArray(){
        int[] array = null;
        int[] expected = Arrays.copyOf(array, array.length);
        BubbleSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void sortSortedArray(){
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        assertEquals(array, array);
    }

}