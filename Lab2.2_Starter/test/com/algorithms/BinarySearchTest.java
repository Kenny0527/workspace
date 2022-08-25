package com.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    // TODO-Lab2.2: Implement tests
    private int[] array;
    private int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    @Test
    public void binarySearch_emptyArray(){
        assertNull(array);
    }

    @Test
    public void binarySearch_failedSearch(){
        int target = 0;
        assertFalse(BinarySearch.binarySearch(target, array2));
    }

    @Test
    public void binarySearch_searchFound(){
        int target = 7;
        assertTrue(BinarySearch.binarySearch(target, array2));
    }

}