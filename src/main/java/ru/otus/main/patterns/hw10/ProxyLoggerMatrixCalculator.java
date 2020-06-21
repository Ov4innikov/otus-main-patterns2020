package ru.otus.main.patterns.hw10;

import ru.otus.main.patterns.hw9.MatrixCalculator;

public class ProxyLoggerMatrixCalculator implements MatrixCalculator {

    private final MatrixCalculator matrixCalculator;

    private boolean isInvoked = false;

    public ProxyLoggerMatrixCalculator(MatrixCalculator matrixCalculator) {
        this.matrixCalculator = matrixCalculator;
    }

    @Override
    public void sum(String fileName) {
        if (!isInvoked) {
            isInvoked = true;
            System.out.println("Название файла = " + fileName);
        }
        System.out.println("Начало вызова");
        matrixCalculator.sum(fileName);
        System.out.println("Конец вызова");
    }
}
