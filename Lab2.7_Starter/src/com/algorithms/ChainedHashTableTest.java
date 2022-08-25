package com.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChainedHashTableTest {

    ChainedHashTable<Integer, String> chainedHashTable = new ChainedHashTable<>(10, new RemainderHashing());
    @BeforeEach
    void init(){
        chainedHashTable.put(12, "Isabel");
        chainedHashTable.put(24, "Frank");
    }

    @Test
    void put() {
        assertEquals("Isabel", chainedHashTable.get(12));
    }

    @Test
    void get() {
        assertEquals("Frank", chainedHashTable.get(24));
    }

    @Test
    void remove() {
    }
}