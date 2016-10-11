package com.ds.probs.primitives;

/**
 * Count number of bits with value 1 in an integer
 */
public class BitCounter {
    /**
     * In java integer uses 32 bits
     * java & bitwise operator will and operation for each bit.
     * time complexity is O(n). best case time complexity is O(1) for input 0.
     * there is no autoboxing for arrays. only for primitives
     * @param number
     */
    public int countBits(int number){
        short numberOfBits = 0;
        while(number != 0){
            numberOfBits += number & 1;
            number >>>= 1;
        }

        return numberOfBits;
    }
}
