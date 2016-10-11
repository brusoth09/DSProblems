package com.ds.probs.arrays;

import com.ds.probs.threads.ArraySummer;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by aburu on 10/8/2016.
 */
public class NumberClassifier {

    /**
     * Rearrange an array to make even numbers come first
     * Time complexity O(n)
     * Space Complexity O(1)
     * @param A
     */
    public void evenOdd(int[] A){
        int nextEven = 0; int nextOdd = A.length - 1;

        while(nextEven < nextOdd){
            if(A[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                int temp = A[nextEven];
                A[nextEven] = A[nextOdd];
                A[nextOdd--] = temp;
            }
        }
    }

    public int PararellProcessing(int[][] A){
        ExecutorService executorService = Executors.newFixedThreadPool(A.length);
        ArraySummer[] summers = new ArraySummer[A.length];
        CountDownLatch latch = new CountDownLatch(A.length);

        for(int i = 0; i < A.length; i++){
            summers[i] = new ArraySummer(A[i], latch);
            executorService.execute(new Thread(summers[i]));
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int total = 0;

        for(ArraySummer summer: summers){
            total += summer.getSum();
        }

        return total;
    }

    private int sumRow(int[] row){
        return 0;
    }
}
