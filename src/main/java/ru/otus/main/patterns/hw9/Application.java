package ru.otus.main.patterns.hw9;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        MatrixFileUtil matrixFileUtil = new MatrixFileUtil();
        MatrixAdapter matrixAdapter = new MatrixAdapter(matrixFileUtil);
        MatrixFileGenerator matrixFileGenerator = new MatrixFileGenerator(matrixAdapter);

        matrixFileGenerator.generate("file", (byte) 3);
    }
}
