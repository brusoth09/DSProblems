package com.ds.probs.arrays;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by aburu on 10/8/2016.
 */
public class ArrayTest {

    @Test
    public void testTwoDimensionArray(){
        assertEquals(new NumberClassifier().PararellProcessing(new int[][]{{ 1, 2, 3},{ 4, 5, 6},{11, 11, 11}}), 54);
    }
}
