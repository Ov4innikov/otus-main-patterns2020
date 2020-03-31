package ru.otus.main.patterns.hw1;

public class String {

    protected char[] arrayOfChar;
    private long length;

    public String() {}

    public String(char[] arrayOfChar) {
        this.arrayOfChar = arrayOfChar.clone();
        length = arrayOfChar.length;
    }

    public String(char ch) {
        this(new char[]{ch});
    }

    public long getLength() {
        return length;
    }

    public void clearString() {
        arrayOfChar = new char[]{};
        length = arrayOfChar.length;
    }

    public void destructString() {
        arrayOfChar = null;
        length = 0;
    }

    public char[] getArrayOfChar() {
        return arrayOfChar.clone();
    }
}
