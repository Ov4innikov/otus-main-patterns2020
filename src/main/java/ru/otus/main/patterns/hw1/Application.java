package ru.otus.main.patterns.hw1;

public class Application {

    public static void main(java.lang.String[] args) {
        char[] chars1 = {'a','b','c'};
        char[] chars2 = {'x','z','v','d'};
        char[] chars3 = {'2'};
        char[] chars4 = {};
        String string1 = new String(chars1);
        CoolString string2 = new CoolString(chars2);
        String string3 = new CoolString(chars3);
        String string4 = new String(chars4);

        StringStack stringStack = new StringStack(2);
        stringStack.put(string1);
        stringStack.put(string2);
        System.out.println(stringStack.getSize());
        System.out.println(stringStack.toString());
        stringStack.delete();
        System.out.println(stringStack.getSize());
        System.out.println(stringStack.toString());
        stringStack.put(string4);
        stringStack.put(string3);
        System.out.println(stringStack.getSize());
        System.out.println(stringStack.toString());
    }
}
