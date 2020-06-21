package ru.otus.main.patterns.hw9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;

public class MatrixFileGenerator {

    private final MatrixCalculator matrixCalculator;

    public MatrixFileGenerator(MatrixCalculator matrixCalculator) {
        this.matrixCalculator = matrixCalculator;
    }

    public void generate(String fileName, byte n) throws IOException {
        String filePath = "src/main/resources/hw9/" + fileName + ".txt";

        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        SecureRandom secureRandom = new SecureRandom();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(secureRandom.nextInt() + "");
                if (j != n - 1) bw.write(" ");
            }
            bw.newLine();
        }
        bw.newLine();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(secureRandom.nextInt() + "");
                if (j != n - 1) bw.write(" ");
            }
            bw.newLine();
        }

        bw.flush();

        matrixCalculator.sum(fileName);
    }

}
