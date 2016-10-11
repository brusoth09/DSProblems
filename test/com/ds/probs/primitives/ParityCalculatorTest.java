package com.ds.probs.primitives;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by aburu on 10/7/2016.
 */
public class ParityCalculatorTest {

    @Test
    public void testFindParity_1(){
        assertEquals(new ParityCalculator().findParity_1(2), 1);
    }

    @Test
    public void testFindParity_2(){
        assertEquals(new ParityCalculator().findParity_2(2),1);
    }

    @Test
    public void testFindParity_4() {
        assertEquals(new ParityCalculator().findParity_4(2l),1);
    }
}
