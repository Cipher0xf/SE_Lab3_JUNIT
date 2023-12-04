package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutationTest {
    @Test
    public void testTriangMutantOne() {
        TritypeMutantOne tri = new TritypeMutantOne();
        assertEquals(4, tri.Triang(1, 1, 3));
    }
    @Test
    public void testTriangMutantTwo() {
        TritypeMutantTwo tri = new TritypeMutantTwo();
        assertEquals(4, tri.Triang(1, 1, 2));
    }
}