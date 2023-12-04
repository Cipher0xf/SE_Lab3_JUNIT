package com.example.tritypejunittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TritypeMCDCTest {
//Decision:
//(Side1+Side2 <= Side3 || Side2+Side3 <= Side1 || Side1+Side3 <= Side2)
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 9));
        assertEquals(4, tri.Triang(5, 2, 1));
        assertEquals(4, tri.Triang(3, 8, 1));
        assertEquals(1, tri.Triang(3, 4, 5));
    }
}
