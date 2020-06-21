package ru.otus.main.patterns.hw8;

import ru.otus.main.patterns.hw2.UnsupportedMatrixException;

import java.util.Arrays;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1000, 0L, TimeUnit.SECONDS, new SynchronousQueue<>());

        int[][] a = {
                {113, 222, 73},
                {24, 1 , 46},
                {31, 44, 41}};
        int[][] b = {
                {46, 12, 42},
                {65, 41 , 1},
                {432, 53, 3}};

        int aLengthX = a.length;
        int bLengthX = b.length;
        if (aLengthX != bLengthX
                || Arrays.stream(a).anyMatch(e -> e.length != aLengthX)
                || Arrays.stream(b).anyMatch(e -> e.length != bLengthX)) throw new UnsupportedMatrixException();
        long[][] result = new long[aLengthX][aLengthX];
        Future<Long>[][] resultCallable = new Future[aLengthX][aLengthX];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                GetElementMultiplicationResult getElementMultiplicationResult = new GetElementMultiplicationResult(a, b, i, j);
                resultCallable[i][j] = threadPoolExecutor.submit(getElementMultiplicationResult);
            }
        }
    }
}
