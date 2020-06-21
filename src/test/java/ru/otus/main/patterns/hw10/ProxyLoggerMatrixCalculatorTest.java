package ru.otus.main.patterns.hw10;

import org.junit.jupiter.api.*;
import ru.otus.main.patterns.hw9.MatrixAdapter;
import ru.otus.main.patterns.hw9.MatrixCalculator;
import ru.otus.main.patterns.hw9.MatrixFileGenerator;
import ru.otus.main.patterns.hw9.MatrixFileUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ProxyLoggerMatrixCalculatorTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void testSum() throws IOException {
        MatrixFileUtil matrixFileUtil = new MatrixFileUtil();
        MatrixCalculator matrixAdapter = new MatrixAdapter(matrixFileUtil);
        MatrixCalculator calculator = new ProxyLoggerMatrixCalculator(matrixAdapter);
        MatrixFileGenerator matrixFileGenerator = new MatrixFileGenerator(calculator);

        matrixFileGenerator.generate("file", (byte) 4);
        matrixFileGenerator.generate("file", (byte) 2);

        assertEquals("Название файла = file\r\n" +
                "Начало вызова\r\n" +
                "Конец вызова\r\n" +
                "Начало вызова\r\n" +
                "Конец вызова\r\n", outContent.toString());
    }

}