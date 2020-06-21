package ru.otus.main.patterns.hw8;

public class Logger {

    private static Logger INSTANCE = new Logger();

    private Logger() {}

    public static Logger getInstance() {
        return INSTANCE;
    }

    public void info(String threadName, Long elementValue) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Thread name = " + threadName + ", value = " + elementValue + ";");
        System.out.println(stringBuilder.toString());
    }
}
