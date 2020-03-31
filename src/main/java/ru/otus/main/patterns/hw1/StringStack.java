package ru.otus.main.patterns.hw1;

public class StringStack {

    private int length = 1;
    private String[] stack = new String[length];
    private int index = -1;

    public StringStack(int defaultLength) {
        if (defaultLength > 0) length = defaultLength;
        else length = 1;
        stack = new String[length];
    }

    public void put(String element) {
        if ((index + 1) >= length && (length * 2) <= ((long) Integer.MAX_VALUE)) {
            length = length * 2;
            String[] newStack = new String[length];
            index++;
            for (int i = 0; i < stack.length; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
            stack[index] = element;
        } else if (index + 1 < length) {
            index++;
            stack[index] = element;
        }
    }

    public void delete() {
        if (index > -1) index--;
    }

    public String get() {
        if (index < 0) return null;
        return stack[index];
    }

    public boolean isEmpty() {
        if (index >= 0) return false;
        return true;
    }

    public int getSize() {
        return index + 1;
    }

    @Override
    public java.lang.String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("String:[");
        for (int i = 0; i <= index; i++) {
            stringBuilder.append("{").append(stack[i].getArrayOfChar()).append("},");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
