package com.ds.probs.primitives;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Testing class for BitCounter
 *
 */
public class BitCounterTest {
    @Test
    public void testCountBits(){
        BitCounter bitCounter = new BitCounter();
        assertEquals(bitCounter.countBits(1), 1);
        assertEquals(bitCounter.countBits(5), 2);
    }
}
