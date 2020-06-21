package ru.otus.main.patterns.hw9;

public class MatrixAdapter implements MatrixCalculator {

    private final MatrixUtil matrixUtil;

    public MatrixAdapter(MatrixUtil matrixUtil) {
        this.matrixUtil = matrixUtil;
    }

    @Override
    public void sum(String fileName) {
        try {
            String filePath1 = "src/main/resources/hw9/" + fileName + ".txt";
            String filePath2 = "src/main/resources/hw9/" + fileName + "Result.txt";
            matrixUtil.handleMatrix(filePath1, filePath2);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }
}
