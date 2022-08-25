package com.algorithms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {
    // TODO-Lab2.4: Implement the tests
    @Test
    public void mergeSort_correctSort(){
        int[] array = {15, 8, 4, 12, 22, 7, 8, 12, 10};
        int[] expected = {4, 8, 15, 7, 22, 12, 8, 12, 10};
        MergeSort ms = new MergeSort();
        Arrays.sort(expected);
        ms.mergeSort(array);
        assertArrayEquals(expected, array);
    }
}