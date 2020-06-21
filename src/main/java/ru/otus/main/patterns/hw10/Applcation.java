package ru.otus.main.patterns.hw10;

import ru.otus.main.patterns.hw9.MatrixAdapter;
import ru.otus.main.patterns.hw9.MatrixCalculator;
import ru.otus.main.patterns.hw9.MatrixFileGenerator;
import ru.otus.main.patterns.hw9.MatrixFileUtil;

import java.io.IOException;

public class Applcation {

    public static void main(String[] args) throws IOException {
        MatrixFileUtil matrixFileUtil = new MatrixFileUtil();
        MatrixCalculator matrixAdapter = new MatrixAdapter(matrixFileUtil);
        MatrixCalculator calculator = new ProxyLoggerMatrixCalculator(matrixAdapter);
        MatrixFileGenerator matrixFileGenerator = new MatrixFileGenerator(calculator);

        matrixFileGenerator.generate("file", (byte) 3);
    }
}
