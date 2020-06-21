package ru.otus.main.patterns.hw8;

import java.util.concurrent.Callable;

public class GetElementMultiplicationResult implements Callable<Long> {

    private static Logger logger = Logger.getInstance();

    private final int[][] a;
    private final int[][] b;
    private final int row;
    private final int col;

    GetElementMultiplicationResult(int[][] a, int[][] b, int row, int col) {
        this.a = a;
        this.b = b;
        this.row = row;
        this.col = col;
    }

    @Override
    public Long call() throws Exception {
        long result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[row][i] * b[i][col];
        }
        logger.info(Thread.currentThread().getName(), result);
        return result;
    }
}
