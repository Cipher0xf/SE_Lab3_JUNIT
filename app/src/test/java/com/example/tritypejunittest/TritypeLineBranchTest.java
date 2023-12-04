package com.example.tritypejunittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TritypeLineBranchTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));
        assertEquals(4, tri.Triang(0, 1, 2));
        assertEquals(4, tri.Triang(1, 1, 9));
        assertEquals(3, tri.Triang(1, 1, 1));
        assertEquals(2, tri.Triang(2, 2, 3));
        assertEquals(2, tri.Triang(3, 4, 3));
        assertEquals(2, tri.Triang(4, 8, 8));
        assertEquals(1, tri.Triang(5, 4, 3));

    }
}