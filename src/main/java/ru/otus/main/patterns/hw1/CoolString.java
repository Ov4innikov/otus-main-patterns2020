package ru.otus.main.patterns.hw1;

import java.util.Arrays;

public class CoolString extends String {

    public CoolString(char[] chars) {
        super(chars);
    }

    public char[] getArrayOfChar(String string) {
        return arrayOfChar.clone();
    }

    public String getString() {
        return new String(arrayOfChar);
    }

    public String getSubString(int from, int to) {
        return new String(Arrays.copyOfRange(arrayOfChar, from, to));
    }

}
