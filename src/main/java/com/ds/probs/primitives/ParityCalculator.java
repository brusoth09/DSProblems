package com.ds.probs.primitives;

/**
 * Created by aburu on 10/6/2016.
 */
public class ParityCalculator {

    private short[] preComputedParity = new short[]{1, 0, 0};
    /**
     * Time complexity is O(n)
     * n - length of number in binary
     * @param x
     * @return
     */
    public  short findParity_1(int x){
        short result = 0;
        while(x != 0) {
            result ^= (x & 1);
            x >>>= 1;
        }
        return result;
    }

    /**
     * Drop the lowest set bit in the input then time complexity reduces to O(k)
     * here k is number of set bits in the number
     */
    public short findParity_2(int x){
        short result = 0;
        while( x !=0){
            result ^= 1;
            x &= (x-1);
        }

        return result;
    }

    /**
     * Time complexity this of this method is O(n / L)
     * @param x
     * @return
     */
    public short findParity_3(int x){
        final int WORD_SIZE  = 16;
        final int BIT_MASK = 0xFFFF;

        return (short)(
                    preComputedParity[((x >>> (3 * WORD_SIZE)) & BIT_MASK)]
                    ^ preComputedParity[((x >>> (2 * WORD_SIZE)) & BIT_MASK)]
                    ^ preComputedParity[((x >>> WORD_SIZE)) & BIT_MASK]
                    ^ preComputedParity[(x & BIT_MASK)]);
    }

    /**
     * Time complexity of this method is O(log n)
     * @param x
     * @return
     */
    public short findParity_4(long x){
        for(int i = 32 ; i >0 ; i /=2){
            x ^= x >>> i;
        }
        return (short) (x & 0x1);
    }
}
