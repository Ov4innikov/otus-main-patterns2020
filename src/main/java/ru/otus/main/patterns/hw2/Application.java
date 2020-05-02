package ru.otus.main.patterns.hw2;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public class Application {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MatrixHandler matrixHandler = new MatrixHandler();
        int[][] a = {
                {11, 222, 3},
                {2, 100 ,4},
                {31, 44, 41}};
        int[][] b = {
                {4, 2, 42},
                {65, 41 , 1},
                {432, 3, 3}};

        long[][] multiplication = matrixHandler.multiplication(a, b);

        for (int i = 0; i < multiplication.length; i++) {
            for (int j = 0; j < multiplication[i].length; j++)
                System.out.print(multiplication[i][j] + " ");
            System.out.println();
        }
    }
}
