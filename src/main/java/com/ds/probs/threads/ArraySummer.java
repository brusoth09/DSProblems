package com.ds.probs.threads;

import java.util.concurrent.CountDownLatch;

/**
 * Created by aburu on 10/8/2016.
 */
public class ArraySummer implements Runnable {
    private int[] array;
    private int sum;
    private CountDownLatch latch;

    public ArraySummer(final int[] array,final CountDownLatch latch) {
        this.array = array;
        this.latch = latch;
    }

    public void run() {
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        latch.countDown();
    }

    public int getSum(){
        return sum;
    }
}
