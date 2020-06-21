package ru.otus.main.patterns.hw9;

import ru.otus.main.patterns.hw2.MatrixHandler;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class MatrixFileUtil implements MatrixUtil {

    @Override
    public void handleMatrix(String arg1, String arg2) throws IOException, ExecutionException, InterruptedException {
        List<int[][]> matrixFromFile = getMatrixFromFile(arg1);
        MatrixHandler matrixHandler = new MatrixHandler();
        long[][] multiplication = matrixHandler.multiplication(matrixFromFile.get(0), matrixFromFile.get(1));
        saveMatrixToFile(arg2, multiplication);
    }

    protected List<int[][]> getMatrixFromFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));

        List<String> lines = new ArrayList<>();
        while (br.ready()) {
            lines.add(br.readLine());
        }

        int indexOfEmptyLine = 0;

        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).length() == 0) {
                indexOfEmptyLine = i;
                break;
            }
        }

        int matrixWidth = lines.get(0).split(" ").length;
        int matrixHeight = lines.size();

        int[][] matrix1 = new int[indexOfEmptyLine][matrixWidth];
        int[][] matrix2 = new int[indexOfEmptyLine][matrixWidth];

        for (int i = 0; i < indexOfEmptyLine; i++) {
            for (int j = 0; j < matrixWidth; j++) {
                String[] line = lines.get(i).split(" ");
                matrix1[i][j] = Integer.parseInt(line[j]);
            }
        }

        for (int i = indexOfEmptyLine + 1; i < matrixHeight; i++) {
            for (int j = 0; j < matrixWidth; j++) {
                String[] line = lines.get(i).split(" ");
                matrix2[i - indexOfEmptyLine - 1][j] = Integer.parseInt(line[j]);
            }
        }

        return Arrays.asList(matrix1, matrix2);
    }

    protected void saveMatrixToFile(String path, long[][] matrix) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                bw.write(matrix[i][j] + "");
                if (j != matrix[i].length - 1) bw.write(" ");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
