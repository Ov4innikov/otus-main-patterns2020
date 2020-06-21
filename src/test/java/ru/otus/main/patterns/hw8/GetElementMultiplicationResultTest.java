package ru.otus.main.patterns.hw8;

import org.junit.jupiter.api.Test;
import ru.otus.main.patterns.hw2.UnsupportedMatrixException;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

class GetElementMultiplicationResultTest {

    @Test
    public void test3x3Matrix() throws Exception {
        int[][] a = {
                {1, 2, 3},
                {2, 3 ,4},
                {1, 1, 1}};
        int[][] b = {
                {4, 2, 42},
                {3, 9 ,4},
                {2, 3, 3}};

        GetElementMultiplicationResult getElementMultiplicationResult = new GetElementMultiplicationResult(a, b, 1, 1);
        Long result = getElementMultiplicationResult.call();
        assertEquals(43, result);
    }
}